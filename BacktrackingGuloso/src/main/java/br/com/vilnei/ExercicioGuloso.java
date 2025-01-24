package br.com.vilnei;
/*
Você tem que dar o troco de uma quantia em dinheiro usando o menor numero possível de moedas.
Exemplo:
Entrada: Quantia 18, Moedas disponiveis 5, 2 e 1.
Saida: 5 ( três moedas de cinco, uma de 2 e uma de 1).
 */
import java.util.Arrays;

public class ExercicioGuloso {

    public static void main(String[] args) {

        int quantia = 18;
        int[] moedas = {5, 2, 1, 7};

        calcularTroco(quantia, moedas);
    }

    private static void calcularTroco(int quantia, int[] moedas) {

        Arrays.sort(moedas);
        reverseArray(moedas);

        System.out.println("Troco para a quantia " + quantia + ":");

        int totalMoedas = 0;

        for (int moeda : moedas) {
            while (quantia >= moeda) {
                quantia -= moeda; // Subtrai a moeda da quantia
                totalMoedas++; // Incrementa o contador de moedas
                System.out.print(moeda + " "); // Exibe a moeda utilizada
            }
        }

        System.out.println("\nTotal de moedas usadas: " + totalMoedas);
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}