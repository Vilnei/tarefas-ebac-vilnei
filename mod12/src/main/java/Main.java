import java.util.*;

/**
 * Exercicio do modulo 12, muitas das coisas aqui sao "inuteis" do tipo desnecessarias em fazer
 * ou facies de fazer de outra forma, mas fiz da forma que eu pudesse testa o maximo que aprendi
 * ate esse momento na EBAC
 * @author Vilnei
 */
public class Main {

    public static void main(String[] args) {


        boolean repeticao = true;

        Scanner s = new Scanner(System.in);//aqui é criado o leito (scanner)
        TreeMap<String, String> map = new TreeMap<>();//aqui eu crio um map para guardar as informaçoes
        List<String> nome = new ArrayList<>();// criada a lista de nomes
        List<String> sexo = new ArrayList<>();// criada a lista de genero

        System.out.println("*****Exercicio do modulo 12, exercicio sobre coleções*****");

        //vamos testa uma repetição para colocada de varios nomes e consolidação da ideia de while
        while (repeticao) {
            System.out.println("""
                    -Escreva um nome por favor!
                    -De preferencia apenas o Primeiro nome.""");
            String scanNome = s.nextLine();

            System.out.println("""
                    -Agora digite o genero dessa pessoa!
                    -Exemplo: m (para masculino) ou f (para feminino)""");
            String scanSexo = s.nextLine();

            //primeiro vamos adicionar em um map, o nome é o sexo
            map.put(scanNome, scanSexo);

            //agora vamos separar em 2 lista uma com nomes e outra com genero
            nome.add(scanNome);
            sexo.add(scanSexo);

            //vamos conferir se a pessao quer colocar mais nomes ou não
            System.out.println("""
                    -Deseja adicionar mais Pessoas?
                    -Se sim digite (Y) se não digite (N)""");
            String resposta = s.nextLine();

            //um if so para continuar no loot ou sair
            //aqui dava para colocar mais opções como se n fosse n ou y ele desse um aviso de caracter invalido e etc
            if (resposta.equalsIgnoreCase("n")) {
                repeticao = false;
            }
        }

        //vamos agora fazer uns prints com for para analisar se esta saindo corretamente
        System.out.println("""
                    Aqui esta a sua lista de nomes e generos de forma separada para analise!
                    """);
        System.out.println("*****************************NOMES**********************************");

        //um FOR so pra saber se os nomes esta na ordem certa quando compardos com os sexos
        for (int i = 0; i < nome.size(); i++) {
            System.out.println("Index: " + i + " | Value: " + nome.get(i));
        }

        System.out.println("*****************************SEXOS**********************************");
        for (int i = 0; i < sexo.size(); i++) {
            System.out.println("Index:" + i + " | Value: " + sexo.get(i));
        }

        System.out.println("\n");
        System.out.println("""
                Agora aqui e a representação do MAP, com nome sendo KEY e o genero/sexo sendo VALUE.""");
        System.out.println(map);

    }
}
