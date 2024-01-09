import java.util.Scanner;

/**
 * esse é o exercicio do modulo 9, e apenas para testa o casting e os Wrapper
 * @author Vilnei
 */

public class Wrapper {
    public static void main(String[] args) {

        System.out.println("Olá, digite um numero, para que possamos converter de primitivo para wrapper");

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        Long numeroWrapper = (long) numero;

        System.out.println("Pronto esse agora e seu valor wrapper"
                + "\n" + numeroWrapper + "\n" +
                "Ele foi recebido como inteiro depois convertido para long e depois para wrapper Long");
    }
}
