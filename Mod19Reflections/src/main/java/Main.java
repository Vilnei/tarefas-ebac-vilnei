import java.util.Arrays;

/**
 * @author Vilnei
 * classe apenas para testa reflection, onde em tempo de execução eu posso trabalhar com opçoes como ler as classes
 */

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Class<Produto> clazz = Produto.class;

        //mostra o nome da class de forma simples
        System.out.println(clazz.getSimpleName());

        //mostra a anotação usada na classe
        System.out.println(clazz.getAnnotation(Tabela.class));

        // mostra a anotação usada no contrutor
        System.out.println(clazz.getConstructor().getDeclaredAnnotation(Tabela.class));

        //mostra todos os fields, em uma lista, inclusive com o seu tipo
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));

        // mostra a anotação usada em uma variavel especifica
        System.out.println(clazz.getDeclaredField("codigo").getAnnotation(Tabela.class));
        

    }

}
