import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Tarefa2 {

    public static void exibirListaComGenero() {

        System.out.println("""
        Agora escreva uma lista de nomes com seus generos representado por uma letra:
            Exemplo:
        -----------Fulano-M,Beltrana-F--------------
        -----------nome-Genero,nome-Gereno----------
        
        para que possamos separar cada nome e genero:
        """);
        Scanner scanner = new Scanner(System.in);
        String recebido = scanner.next();

        TreeSet<String> listaOrdenada = new TreeSet<>(List.of(recebido.split(",")));
        TreeSet<String> masculino = new TreeSet<>();
        TreeSet<String> feminino = new TreeSet<>();

        for (String i : listaOrdenada) {
            if (i.contains("-m") || i.contains("-M")) {
                masculino.add(i);
            } else if (i.contains("-f") || i.contains("-F")) {
                feminino.add(i);
            }else {
                System.out.println("Algo de errado não esta certo na digitação da sua lista");
            }
        }
        System.out.println("Essa é a lista ordenada alfabeticamente: " + listaOrdenada + "\n");
        System.out.println("Essa é a lista do genero Masculino (-m): " + masculino + "\n");
        System.out.println("Essa é a lista do genero Feminino (-f): " + feminino);
    }
}