package Funciona;

// implementa interface Comparable para comparação na priorityQueue
public class Vertice implements Comparable<Vertice> {
    // nome do vertice, arestas que saem dele, distancia (setada como maximo para aplicar o algoritimo),
    // se ele foi visitado e o vertice anterior (como uma lista simples encadeada). 

    int id;
    Aresta[] adjacentes;
    double distancia = Integer.MAX_VALUE;
    boolean visitado;
    Vertice anterior;

    // construtor vazio para os vertices inicio e fim (no Main)
    public Vertice() {}

    // construtor com apenas o id, outros valores são adicionados durante processamento
    public Vertice(int id) {
        this.id = id;
    }

    // metodo da interface Comparable
    public int compareTo(Vertice other) {
        return Double.compare(distancia, other.distancia);
    }
}
