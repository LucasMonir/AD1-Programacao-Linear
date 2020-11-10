package Trabalho;

// Implementa interface Comparable para comparação na priorityQueue
public class Vertice implements Comparable<Vertice> {
    // nome do vértice, arestas que saem dele, distância (definida como máximo para aplicar o algoritimo),
    // se ele foi visitado e o vértice anterior (como uma lista simples encadeada). 

    int id;
    Aresta[] adjacentes;
    double distancia = Integer.MAX_VALUE;
    boolean visitado;
    Vertice anterior;

    // Construtor vazio para os vértices início e fim (no Main)
    public Vertice() {}

    // Construtor com apenas o id, outros valores são adicionados durante processamento
    public Vertice(int id) {
        this.id = id;
    }

    // Método da interface Comparable
    public int compareTo(Vertice other) {
        return Double.compare(distancia, other.distancia);
    }
}
