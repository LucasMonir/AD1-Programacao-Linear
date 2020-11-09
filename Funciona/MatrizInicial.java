package Trabalho;

// Classe que possui a matriz definida Hard-Code
class MatrizInicial{
    // Define um valor para representar o infinito (caso de quando um vertice não possui aresta para um outro)
    final static int infinito = 99999;
    
    // Método para retornar a matriz inicial fornecida que foi colocada na classe por motivos de clareza
    public static int[][] getMatriz(){
        return new int[][]{
            { 0, infinito, infinito, 861, infinito, 211, infinito, infinito, infinito, 586, infinito, 753, 382, 896, infinito, infinito, infinito, infinito, infinito, infinito },
            { infinito, 0, 423, 617, 365, infinito, infinito, infinito, infinito, 357, infinito, infinito, 806, infinito, infinito, infinito, infinito, infinito, infinito, infinito },
            { infinito, 423, 0, 554, 359, infinito, infinito, infinito, infinito, 306, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito },
            { 861, 617, 554, 0, infinito, infinito, infinito, infinito, infinito, 656, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito },
            { infinito, 365, 359, infinito, 0, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito },
            { 211, infinito, infinito, infinito, infinito, 0, 988, infinito, 293, 102, infinito, 870, 399, infinito, infinito, infinito, infinito, infinito, infinito, infinito },
            { infinito, infinito, infinito, infinito, infinito, 988, 0, 228, 43, infinito, 573, 663, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito },
            { infinito, infinito, infinito, infinito, infinito, infinito, 288, 0, 801, infinito, 31, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito },
            { infinito, infinito, infinito, infinito, infinito, 293, 43, 801, 0, 724, 927, 936, infinito, infinito, 696, infinito, infinito, infinito, infinito, infinito },
            { 586, 357, 306, 656, infinito, 102, infinito, infinito, 724, 0, infinito, 736, 672, 804, infinito, infinito, infinito, infinito, infinito, infinito },
            { infinito, infinito, infinito, infinito, infinito, infinito, 573, 31, 927, infinito, 0, 634, infinito, infinito, 927, infinito, infinito, infinito, infinito, infinito },
            { 753, infinito, infinito, infinito, infinito, 870, 663, infinito, 936, 736, 634, 0, 844, 71, 798, infinito, 713, infinito, infinito, infinito },
            { 382, 806, infinito, infinito, infinito, 399, infinito, infinito, infinito, 672, infinito, 844, 0, 21, infinito, 299, infinito, infinito, infinito, infinito },
            { 896, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, 804, infinito, 71, 21, 0, 244, 447, 726, infinito, infinito, infinito },
            { infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, 696, infinito, 927, 798, infinito, 244, 0, infinito, 387, infinito, infinito, infinito },
            { infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, 299, 447, infinito, 0, 503, 113, 431, infinito },
            { infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, 713, infinito, 726, 387, 503, 0, 916, 490, infinito },
            { infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, 113, 916, 0, 980, 326 },
            { infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, 431, 490, 980, 0, 455 },
            { infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, infinito, 326, 455, 0 } 
        };   
    }
}