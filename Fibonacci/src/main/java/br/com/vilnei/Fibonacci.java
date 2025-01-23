package br.com.vilnei;

public class Fibonacci {
    //essa e a formula mais simples porem, pior por ser de forma recursiva e ter q processar tudo n vezes
    public int encontrarElemento (int n) {
        if ( n <= 1) {
            return n;
        }
        return encontrarElemento(n -1) + encontrarElemento(n -2);
    }
}
