import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import javax.swing.JOptionPane;

public class Main {
    static double dt = 0;
    //tenta isso aqui https://www.baeldung.com/java-dijkstra
    public static void djikstra(Vertice inicio){
        inicio.distancia = 0;

		PriorityQueue<Vertice> queue = new PriorityQueue<Vertice>();
        queue.add(inicio);
        
            while(!queue.isEmpty()){
			Vertice u = queue.poll();
			
			for(Aresta a: u.adjacentes){

				Vertice v = a.destino;
				double valor = a.valor;

				double distanciaW = u.distancia+valor;
				if(distanciaW < v.distancia){
					queue.remove(v);
					v.distancia = distanciaW;
                    v.anterior = u;
					queue.add(v);
                }
            }
		}
    }

    public static String getShortestPathTo(Vertice destino){
        String caminhos = ""; 
        int cost = 0;

		List<Vertice> caminho = new ArrayList<Vertice>();
		for(Vertice v = destino; v!=null; v = v.anterior){
            caminho.add(v);
		}

        Collections.reverse(caminho);
        for (Vertice vertice : caminho) {
            caminhos += vertice.id + ", ";
        }
        
        for (Vertice vertice : caminho) {
            dt += vertice.distancia;     
        }
		return caminhos;
	}

    static class Aresta{
        int valor;
        Vertice destino;

        public Aresta(int valor, Vertice destino){
            this.valor = valor;
            this.destino = destino;
        }
    }

    public static class Vertice implements Comparable<Vertice>{
        int id;
        Aresta[] adjacentes;
        double distancia = Integer.MAX_VALUE;
        boolean visitado;
        Vertice anterior;

        public Vertice(){}

        public Vertice(int id){
            this.id = id;
        }

        public int compareTo(Vertice other){
            return Double.compare(distancia, other.distancia);
        }
    }

    public static void main(String[] args) {
        
        Vertice v1 = new Vertice(1);
        Vertice v2 = new Vertice(2);
        Vertice v3 = new Vertice(3);
        Vertice v4 = new Vertice(4);
        Vertice v5 = new Vertice(5);
        Vertice v6 = new Vertice(6);
        Vertice v7 = new Vertice(7);
        Vertice v8 = new Vertice(8);
        Vertice v9 = new Vertice(9);
        Vertice v10 = new Vertice(10);
        Vertice v11 = new Vertice(11);
        Vertice v12 = new Vertice(12);
        Vertice v13 = new Vertice(13);
        Vertice v14 = new Vertice(14);
        Vertice v15 = new Vertice(15);
        Vertice v16 = new Vertice(16);
        Vertice v17 = new Vertice(17);
        Vertice v18 = new Vertice(18);
        Vertice v19 = new Vertice(19);
        Vertice v20 = new Vertice(20);

        v1.adjacentes = new Aresta[]{
            new Aresta(861,v4),
            new Aresta(211,v6),
            new Aresta(586,v10),
            new Aresta(753,v12),
            new Aresta(382,v13),
            new Aresta(896, v14)
        };

        v2.adjacentes = new Aresta[]{
            new Aresta(423 ,  v3),
            new Aresta(617,  v4),
            new Aresta(365,  v5),
            new Aresta(357,  v10),
            new Aresta(806,  v13)
        };

        v3.adjacentes = new Aresta[]{
            new Aresta(423, v2),
            new Aresta(554, v4),
            new Aresta(359, v5),
            new Aresta(306, v10)
        };

        v4.adjacentes = new Aresta[]{
            new Aresta(861, v1),
            new Aresta(617, v2),
            new Aresta(554, v3),
            new Aresta(656, v10)
        };

        v5.adjacentes = new Aresta[]{
            new Aresta(365, v2),
            new Aresta(359, v3)
        };

        v6.adjacentes = new Aresta[]{
            new Aresta(211, v1),
            new Aresta(988, v7),
            new Aresta(293, v9),
            new Aresta(102, v10),
            new Aresta(870, v12),
            new Aresta(399, v13)
        };

        v7.adjacentes = new Aresta[]{
            new Aresta(988, v6),
            new Aresta(228, v8),
            new Aresta(43, v9),
            new Aresta(573, v1),
            new Aresta(663, v12),
        };

        v8.adjacentes = new Aresta[]{
            new Aresta(228, v7),
            new Aresta(801, v9),
            new Aresta(31, v11)
        };

        v9.adjacentes = new Aresta[]{
            new Aresta(293, v6),
            new Aresta(43, v7),
            new Aresta(801, v8),
            new Aresta(724, v10),
            new Aresta(927, v11),
            new Aresta(936, v12),
            new Aresta(696, v15)
        };

        v10.adjacentes = new Aresta[]{
            new Aresta(586 , v1),
            new Aresta(357, v2),
            new Aresta(306, v3),
            new Aresta(656, v4),
            new Aresta(102, v6),
            new Aresta(724, v9),
            new Aresta(736, v12),
            new Aresta(672, v13),
            new Aresta(804, v14)
        };

        v11.adjacentes = new Aresta[]{
            new Aresta(573 , v7),
            new Aresta(31, v8),
            new Aresta(927, v9),
            new Aresta(634, v12),
            new Aresta(927, v15)
        };

        v12.adjacentes = new Aresta[]{
            new Aresta(753 , v1),
            new Aresta(870, v6),
            new Aresta(663, v7),
            new Aresta(936, v9),
            new Aresta(736, v10),
            new Aresta(634, v11),
            new Aresta(844, v13),
            new Aresta(71, v14),
            new Aresta(798, v15),
            new Aresta(713, v17)
        };

        v13.adjacentes = new Aresta[]{
            new Aresta(382,  v1),
            new Aresta(806,  v2),
            new Aresta(399,  v6),
            new Aresta(672,  v10),
            new Aresta(844,  v12),
            new Aresta(21,  v14),
            new Aresta(299,  v16)
        };

        v14.adjacentes = new Aresta[]{
            new Aresta(896 , v1),
            new Aresta(804, v10),
            new Aresta(71, v12),
            new Aresta(21, v13),
            new Aresta(244, v15),
            new Aresta(447, v16),
            new Aresta(726, v17)
        };

        v15.adjacentes = new Aresta[]{
            new Aresta(696 , v9),
            new Aresta(927, v11),
            new Aresta(798, v12),
            new Aresta(244, v14),
            new Aresta(387, v17)
        };

        v16.adjacentes = new Aresta[]{
            new Aresta(299, v13),
            new Aresta(447, v4),
            new Aresta(503, v17),
            new Aresta(113, v18),
            new Aresta(431, v19)
        };

        v17.adjacentes = new Aresta[]{
            new Aresta(713, v12),
            new Aresta(726, v14),
            new Aresta(387, v15),
            new Aresta(503, v16),
            new Aresta(916, v18),
            new Aresta(490, v19)
        };

        v18.adjacentes = new Aresta[]{
            new Aresta(113, v16),
            new Aresta(916, v17),
            new Aresta(980, v19),
            new Aresta(326, v20)
        };

        v19.adjacentes = new Aresta[]{
            new Aresta(431, v16),
            new Aresta(490, v17),
            new Aresta(980, v18),
            new Aresta(455, v20)
        };

        v20.adjacentes = new Aresta[]{
            new Aresta(326, v18),
            new Aresta(455, v19)
        };

        Vertice[] vertices = {v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20};

        int inicio = Integer.parseInt(JOptionPane.showInputDialog("qual o ponto inicial? 1,2...20):"));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("qual o destino? (1,2...20):"));

        Vertice comeco = new Vertice();
        Vertice alvo = new Vertice();

        for (Vertice vertice : vertices) {
            if(vertice.id == inicio){
                comeco = vertice;
            } else if(vertice.id == fim){
                alvo = vertice;
            }
        }

        djikstra(comeco);
        String caminhos = getShortestPathTo(alvo);
        System.out.println("" + caminhos + "\n" + dt);
    }

}
