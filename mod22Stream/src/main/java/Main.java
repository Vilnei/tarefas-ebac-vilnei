import java.util.List;

/**
 * criado uma lista só com as pessoas do sexo feminino convertendo ela de Stream para Lista e depois printado no console
 * criado uma lista só com pessoas do sexo masculino e printado no console usando forEach
 * @author Vilnei
 */
public class Main {
    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().criarPessoas();
        System.out.println("***************Lista completa de Pessoas***************" + lista);

        System.out.println("\n*******Lista de Pessoas do sexo Masculino*******");
        lista.stream().filter(masculino -> masculino.getSexo().equals("M")).forEach(System.out::println);

        System.out.println("\n*******Lista de Pessoas do sexo Feminino*******");
        List<Pessoa> listaFeminina = lista.stream().filter(feminino -> feminino.getSexo().equals("F")).toList();
        System.out.println(listaFeminina);


//        lista.stream().filter(masculino -> masculino.getSexo().equals("F")).forEach(System.out::println);


    }
}
