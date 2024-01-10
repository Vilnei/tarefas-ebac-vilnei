import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * eu sei que n é a melhor maneira mas eu queria testa algumas coisas e aprender metodos diferentes
 * @author Vilnei
 */
public class Tarefa1 {

    public static void exibirLista() {

        System.out.println("----Escreva uma lista de nomes separados com virgula, e sem espaço depois da virgula.----");
        Scanner scanner = new Scanner(System.in);
        String recebido = scanner.nextLine();

        String[] lista = recebido.split(",");//usando dessa forma para testar as diferenças de List<String>...

        System.out.println("\n----Pronto! foi criada uma lista onde cada elemento depois da virgula esta em um indice----");

        for (String s : lista) {
            System.out.println(s);
        }

        System.out.println("\n----Agora vamos ordenar a lista, transformando em TreeSet----");
// o TreeSet garante a organização pois ele implementa o metodo SortedSet
        TreeSet<String> listaOrdenada = new TreeSet<>(List.of(lista));

//        listaOrdenada.stream().sorted();

//        System.out.println(listaOrdenada);
        for (String lo : listaOrdenada) {
            System.out.println(lo);
        }

    }
}
