package br.com.vilnei;

public class FatorioalRecursivo {

    public  static int calcularFatorial ( int n) {
        // esse if e apenas para condiçao de 0 e numeros negativos.
        if (n == 0) {
            return 1;

        } else if (n < 0) {
            //aqui deveria ter um erro ( throw ) mas pra simplificar coloquei 0.
            return 0;

        }
        //chamando a função de forma recursiva.
        return n * calcularFatorial(n -1);
    }

    public static void main (String[] args) {
        //se o numero a ser calculado for maior que 12 o valor fica errado por conta do tipo int.
        int numero = 12;
        int fatorial = calcularFatorial(numero);
        System.out.println("O valor  de " + numero + "! é: " + fatorial);
    }
}
