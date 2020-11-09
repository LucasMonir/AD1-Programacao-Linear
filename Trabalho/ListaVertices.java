package Trabalho;

public class ListaVertices {
    public static Vertice[] getListaVertices(){
        // declaração dos vertices
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

        // adição das arestas aos vertices
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

        // retorna vetor com todos os vertices
        return new Vertice[]{v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20};
    }
}
