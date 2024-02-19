public class Main {
    public static void main(String[] args) {

        @Tabela
        String testeAnnotation = "-String usando a annotation Tabela do exercicio pedido no modulo 18 da EBAC";
        testePrimeiraAnotacao(testeAnnotation);

    }
    @PrimeiraAnotacao(value = "teste", listaDeNumeros = {}, numero = 12)
    private static void testePrimeiraAnotacao(String teste) {
        System.out.println("função so para testa minha primeira anotação e saber como ela se comporta");
        System.out.println(teste);
    }
}
