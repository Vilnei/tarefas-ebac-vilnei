package br.com.vilnei;

public class FatorialDinamico {
    public static long calcularFatorial ( int n) {

        long[] fatorial = new long[n + 1];

        // garantindo que a posição 0 vai sempre 1 por fatorial de 0 = 1.
        fatorial[0] = 1;

        //percorre as posiçoes da lista mutiplicando os valores e guardando so resultados.
        for (int i = 1; i <= n; i++) {
            fatorial[i] = i * fatorial[i -1];
        }

        return fatorial[n];
    }

    public static void main(String[] args) {
        //se o numero a ser calculado for maior que 20 gera erro por conta do tipo long.
        int numero = 20;
        long fatorial = calcularFatorial(numero);
        System.out.println("O valor  de " + numero + "! é: " + fatorial);
    }
}
