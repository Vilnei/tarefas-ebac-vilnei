package br.com.vilnei;

public class FibinacciDinamicoUm {
    private final int CAPACIDADE = 100;
    private final long[] elementosFib = new long[CAPACIDADE];

    public long encontrarElementoPD (int n) {
        for (int i = 0; i < CAPACIDADE; i++) {
            elementosFib[i] = -1;
        }
        return encontrarElementoPD(n);
    }
}
