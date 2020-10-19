package Funciona;

// bibliotecas necessárias
import java.util.*;
import javax.swing.JOptionPane;

public class Main {

    static int tamanho = 20;
    // Metodo para encontrar todos os menores caminho
    public static void calculaCaminhos(Vertice inicio){
        // distancia até ele mesmo é 0
        inicio.distancia = 0;

        // Lista prioritária pro processamento dos vertices 
		PriorityQueue<Vertice> queue = new PriorityQueue<Vertice>();
        
        // Metodo verifica todos os caminhos possiveis e armazena menores distancias
        // Anda pelos vertices do mesmo metodo de uma lista simples encadeada
        queue.add(inicio);
            // Enquanto não estiver vazio o metodo continua
            while(!queue.isEmpty()){
			Vertice verticeAtual = queue.poll();
            
            // Pra cada aresta saindo do vertice, cria um vertice auxiliar
            // Testa o caminho adicionando ele como destino
			for(Aresta a: verticeAtual.adjacentes){
				Vertice verticeAuxiliar = a.destino;
				double valor = a.valor;
                double distanciaW = verticeAtual.distancia+valor;
                
                // Aplica lógica de djikstra de comparar os menores caminhos 
                if(distanciaW < verticeAuxiliar.distancia){
					queue.remove(verticeAuxiliar);
					verticeAuxiliar.distancia = distanciaW;
                    verticeAuxiliar.anterior = verticeAtual;
					queue.add(verticeAuxiliar);
                }
            }
		}
    }

    // Metodo pra encontrar o caminho baseado no resultado de calculaCaminhos
    public static String encontraCaminho(Vertice destino){
        // Anota os caminhos
        String caminhos = ""; 

        // Adiciona os caminhos percorridos em uma lista partindo do destino
		List<Vertice> caminho = new ArrayList<Vertice>();
		for(Vertice v = destino; v !=null ; v = v.anterior){
            caminho.add(v);
		}

        // Coloca a lista na ordem inicio -> fim
        Collections.reverse(caminho);
        for (Vertice vertice : caminho) {
            caminhos += vertice.id + ", " ;
        }
        
        // Retorna caminhos com o custo minimo
		return "Caminho de menor custo: " + caminhos + " Com custo total de: " + destino.distancia;
	}

    public static void main(String[] args) {
        
        // Recebe a lista de vertices de classe externa ListaVertices por motivos de legibilidade
        Vertice[] vertices = ListaVertices.getListaVertices();

        // Escolha do menu
        int op = 5;

        // Menu com while e switch para escolher operação desejada
        while(op != 0){
            switch(op){
                case 5:
                    op = Integer.parseInt(JOptionPane.showInputDialog("Operação 1: Exibir caminho minimo entre 2 vértices \n" 
                    + "Operação 2: Exibir matriz de distancia final \n"
                    + "Opção escolhida? (1 | 2)"));
                break;

                case 1:
                    // Armazena opções selecionadas pelo usuário
                    int inicio = Integer.parseInt(JOptionPane.showInputDialog("qual o ponto inicial? 1,2...20):"));
                    int fim = Integer.parseInt(JOptionPane.showInputDialog("qual o destino? (1,2...20):"));

                    // Associa o numero escolhido com o respectivo vertice da lista
                    Vertice comeco = qualVertice(inicio, vertices);
                    Vertice alvo = qualVertice(fim, vertices);

                    // Chama metodos do algoritimo
                    calculaCaminhos(comeco);
                    String menorCaminho = encontraCaminho(alvo);

                    // Exibe resultado caminho mais curto com o custo
                    JOptionPane.showMessageDialog(null, menorCaminho);

                    // Retorna ao menu principal
                    op =5;
                break;

                case 2:
                    // Instancia a matriz fornecida, em outra classe por motivos de clareza
                    int matrizInicial[][] = MatrizInicial.getMatriz();
                    
                    // Utiliza o metodo de floyd na classe Floyd para encontrar matriz de menores valores
                    int matrizFinal[][] = Floyd.aplicaFloyd(matrizInicial, tamanho);
                    
                    //Exibe a matriz inteira na tela (de forma simples por motivos de teste)
                    JOptionPane.showMessageDialog(null, toString(matrizFinal));

                    // Retorna ao menu principal
                    op = 5;
                break;

                // Operação padrão para caso nenhuma entrada conhecida seja escolhida
                default:
                    op = 5;
            }
        }        
    }

    // Método para criar uma String com todos os valores da matriz final 
    private static String toString(int matrizFinal[][]) {

        // String para armazenar a lista total
        String resultado = " ";

        // Para cada item na matriz, se o valor não for infinito, adicioná-lo á String
        for (int i = 0; i < tamanho; ++i) {
            for (int j = 0; j < tamanho; ++j) {
                if (matrizFinal[i][j] == MatrizInicial.infinito){
                    resultado += " Infinito |";
                }
                else{
                    resultado += " - " +matrizFinal[i][j] + " |";
                }       
            }
            resultado += " \n";
        }

        // Retorna a String
        return resultado;
    }

    // Método utilizado para desocobrir qual vértice baseado em seu id
    public static Vertice qualVertice(int v, Vertice[] listaVertices){
        for (Vertice vertice : listaVertices) {
            if(vertice.id == v){
                return vertice;
            }
        }
        return null;
    }
}
