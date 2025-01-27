package br.com.vilnei;

/**
 * @author Vilnei
 * Classe responsavel por fazer calculos simples como adisão, subtrasão, mutiplicação e divição.
 * todos de forma bem simples apenas para teste.
 * todos recebem 2 paramentros "a" e "b" e apenas divição aceita numeros com virgula.
 */

public class Calculadora {

    public int adicionar(int a, int b) {
        return a + b;
    }

    public int subtrair (int a, int b) {
        return a - b;
    }

    public int multiplicar (int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por ZERO não e possivel");
        }
        return a / b;
    }

}
