package br.com.vilnei;

//exemplo das NRainhas

public class ExemploBacktraking {

    private static boolean temAtaque (int x, int y, int[][] tab) {
        //checar linhas e colunas
        for (int j = 0; j < tab.length; j++) {
            if (tab[x][j] == 1) {
                return true;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][y] == 1) {
                return true;
            }
        }

        //checar as diagonais
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                int indEsq = i + j;
                int indDir = i - j;

                if (indEsq == (x + y)) {
                    if (tab[i][j] == 1) {
                        return true;
                    }
                }

                if (indDir == (x - y)) {
                    if (tab[i][j] == 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static void imprimeTabuleiro (int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean resolveNRainhas ( int [][] tab, int n) {
        // checa se todas as rainhas foram colocadas
        if ( n == 0) {
            return true;
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j =0; j < tab.length; j++) {
                if (temAtaque(i, j, tab)) {
                    continue;
                }

                //Colocando a rainha no tabuleiro
                tab[i][j] = 1;

                if (resolveNRainhas(tab, n - 1)) {
                    return true;
                }

                //solução não encontrada, desfazendo a última mudança
                tab[i][j] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Teste de NRainhas");
        int[][] tab = {
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int n = 8;

        boolean resultado = resolveNRainhas(tab, n);

        if (resultado) {
            imprimeTabuleiro(tab);
        }else {
            System.out.println("Não deu certo");
        }
    }

}
