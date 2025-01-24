package br.com.vilnei;

/*Dado um conjunto S de elementos únicos, calcule todos os seus subconjuntos de n elementos.
Exe:
Entrada: S = [1,2,3], n = 2
Saída: [1,2], [1,3], [2,3]

Entrada: S = [1,2,3,4], n = 1
Saída: [1], [2], [3], [4]
obs: lembre-se de descartar as soluções que não atendem ao problema!
*/

import java.util.ArrayList;
import java.util.List;

public class ExercicioBacktraking {

    // Método principal que chama o backtracking
    public static void main(String[] args) {

        int[] S = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 2;

        List<List<Integer>> resultados = new ArrayList<>();

        gerarSubconjuntos(S, n, 0, new ArrayList<>(), resultados);

        for (List<Integer> subconjunto : resultados) {
            System.out.println(subconjunto);
        }
    }

    // Método de backtracking
    private static void gerarSubconjuntos(int[] S, int n, int index, List<Integer> atual, List<List<Integer>> resultados) {

        if (atual.size() == n) {
            resultados.add(new ArrayList<>(atual));
            return;
        }

        if (index >= S.length) {
            return;
        }

        atual.add(S[index]);
        gerarSubconjuntos(S, n, index + 1, atual, resultados);

        atual.remove(atual.size() - 1);
        gerarSubconjuntos(S, n, index + 1, atual, resultados);
    }
}