import java.util.List;

/**
 * @author Vilnei
 */
public class Main {
    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().criarPessoas();
        System.out.println("\n***************Lista completa de Pessoas***************\n");
        lista.forEach(System.out::println);

        System.out.println("\n***************Lista de Pessoas do sexo Masculino*******\n");
        lista.stream().filter(masculino -> masculino.getSexo().equals("M")).forEach(System.out::println);

        System.out.println("\n***************Lista de Pessoas do sexo Feminino********\n");
        lista.stream().filter(feminino -> feminino.getSexo().equals("F")).forEach(System.out::println);

    }
}
