package Funciona;

// bibliotecas necessárias
import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    static double dt = 0;

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
            caminhos += vertice.id + ", ";
        }
        
        // Faz a adição de todas as distancias até o destino
        for (Vertice vertice : caminho) {
            dt += vertice.distancia;     
        }
        // Retorna caminhos com o custo minimo
		return "Caminho de menor custo: " + caminhos + ", Custo total: " + dt;
	}

    public static void main(String[] args) {
        
        // Recebe a lista de vertices de classe externa ListaVertices por motivos de legibilidade
        Vertice[] vertices = ListaVertices.getListaVertices();

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
    }

    public static Vertice qualVertice(int v, Vertice[] listaVertices){
        for (Vertice vertice : listaVertices) {
            if(vertice.id == v){
                return vertice;
            }
        }
        return null;
    }
}
