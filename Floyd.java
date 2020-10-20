package Funciona;

// Classe que possui o algorotimo de floyd
public class Floyd {

    // Método que aplica o algoritimo
    public static int[][] aplicaFloyd(int matrizInicial[][], int tamanho) {
        // Recebe a matriz inicial e cria a final ja com base na mesma
        int matrizFinal[][] = matrizInicial;
        
        // Sequencia de for's encadeados para percorrer a matriz
        for (int k = 0; k < tamanho; k++) {
            
            for (int i = 0; i < tamanho; i++) {
                
                for (int j = 0; j < tamanho; j++) {
                    // Se o valor for menor que o fornecido na matriz, o novo valor se torna o atual na matriz
                    if (matrizFinal[i][k] + matrizFinal[k][j] < matrizFinal[i][j]){
                        matrizFinal[i][j] = matrizFinal[i][k] + matrizFinal[k][j];
                        System.out.println(i +" " + k );
                    }

                }
            }
        }

        // Retorna a matriz resultante
        return matrizFinal;
    }
}
