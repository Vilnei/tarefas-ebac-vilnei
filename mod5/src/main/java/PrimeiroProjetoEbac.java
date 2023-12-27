import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimeiroProjetoEbac {

    public static void main(String[] args) {

//        depois vamos montar essa lista de uma forma mais organizada pq assim asicionado 1 a 1 esta fui feio
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("-Olá, Seja bem vindo ao meu primeiro projeto na EBAC\n-Poderia me informar seu nome?" );

        String name = scanner.next();

        System.out.println("Seja muito bem vindo, " + name.toUpperCase() +
                "\n-Gostaria de saber em qual modelo devemos trabalhar?\n" +
                "1 - Modo de Desenvolvedor\n2 - Modo de Teste\n3 - Modo de usuario padrão");

        String mode = scanner.next();

        // depois tem q pensar em uma forma mais elegante de fazer esses ifs
        if( mode.equals(list.get(0)) ) {
            System.out.println("- Acionando Modo Desenvolvedor");
        } else if( mode.equals(list.get(1)) ) {
            System.out.println("- Acionando Modo Teste");
        } else if( mode.equals(list.get(2)) ) {
            System.out.println("- Acionando Modo Usuario Padrão");
        } else {
            System.out.println("- Acho que você digitou algo errado!");
        }

        System.out.println("""
                ----------------------------------------------
                - He so isso msm, so pra testa algumas coisas
                - Finalizamos aqui, fica com Deus!!!""");

    }

}
