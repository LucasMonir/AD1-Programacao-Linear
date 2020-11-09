package Funciona;

// Classe que possui o algorotimo de floyd
public class Floyd {
    //Variável com numero máximo para caso não existir caminho
    final static int infinito = 9999, nV = 20;

    // Método que aplica o algoritimo e retorna matriz de roteamento
    public static int[][] roteamento(int matrizFinal[][], int tamanho){

        // Inicia matrizes que serão usadas pela logica
        int matrizA[][] = new int[20][20];
        int matrizRoteamento[][] = new int[20][20];

        // Faz atribuição dos valores para cada coordenada da matriz
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                matrizA[i][j] = matrizFinal[i][j];
                matrizRoteamento[i][j] = 0;
            }
        }

        // Zera a matriz A
        for(int i = 0; i < tamanho; i++){
            matrizA[i][i] = 0;
        }

        // Lógica para percorrer todas as linhas da matriz 
        for(int k = 0; k < tamanho; k++){
            for(int i = 0; i < tamanho; i++){
                for(int j = 0; j < tamanho; j++){
                    if (matrizA[i][k] + matrizA[k][j] < matrizA[i][j]){

                        // Se a soma dos valores for menor q o valor atual então a soma toma seu lugar
                        matrizA[i][j] = matrizA[i][k] + matrizA[k][j];

                        // Armazena o vertice em questão que representa o caminho
                        matrizRoteamento[i][j] = k + 1;
                    }
                }
            }
        }

        return matrizRoteamento;
    }

    public static int[][] todasDistanciasFinais(int matrizInicial[][], int tamanho) {
        // Recebe a matriz inicial e cria a final ja com base na mesma
        int matrizFinal[][] = matrizInicial;
        
        // Sequencia de for's encadeados para percorrer a matriz, linha por linha
        for (int k = 0; k < tamanho; k++) {
            
            for (int i = 0; i < tamanho; i++) {
                
                for (int j = 0; j < tamanho; j++) {
                    
                    // Se o valor for menor que o fornecido na matriz, o novo valor se torna o atual na matriz
                    if (matrizFinal[i][k] + matrizFinal[k][j] < matrizFinal[i][j]){
                        matrizFinal[i][j] = matrizFinal[i][k] + matrizFinal[k][j];
                    }
                }
            }
        }

        // Retorna a matriz resultante
        return matrizFinal;
    }

    // Método para colocar a matriz em uma String
    public static String toString(int matriz[][], int tamanho) {
        // Inicializa a matriz final
        int[][] matrizFinal = new int[20][20];

        // Completa a matriz com os valores da anterior, percorrendo cada linha
        for (int i = 0; i < tamanho; ++i) {
            for (int j = 0; j < tamanho; ++j) {
                
                // Se não houver cmainho então é infinito
                if (matriz[i][j] == infinito){
                    matrizFinal[i][j] = 99999; 
                }

                // Percorre o triangulo superior principal
                else{
                    if(i<=j){
                        matrizFinal[i][j] = matriz[i][j]; 
                    }
                }
            }
        }

        // Processo inverso, percorrendo a matriz ao contrário
        for (int i = tamanho-1; i >= 0; --i) {
            for (int j = tamanho-1; j >= 0; --j) {
                
                // Se não houver caminho então é infinito
                if (matriz[i][j] == infinito){
                    matrizFinal[i][j] = 99999; 
                }

                // Percorre o triangulo inferior principal
                else{
                    if(i>=j){
                        matrizFinal[i][j] = matrizFinal[j][i]; 
                    }
                }
            }
        }    

        // Inicializa String com todos os resultados
        String saida = "";

        // Roda por toda matriz e coloca os resultados dentro da String
        for (int i = 0; i < tamanho; ++i) {
            
            // Número da linha para melhor visualização
            saida += (i+1 + ":  ");


            for (int j = 0; j < tamanho; ++j) {
               saida += (matrizFinal[i][j] + " | ");
            }

            // Adiciona quebra de linhas
            saida += " \n ";
        }
        
        // Retorna o resultado
        return saida;
    }
}
