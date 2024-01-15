/**
 * exercicio do modulo 13 interfaces, heranças composição e agregação
 * vamos extender de uma classe abstrata e ultilizar seus recursos, para enteder melhor os seus usos
 * @author Vilnei
 */

public class Main {
    public static void main(String[] args) {

        //primeiro vamos criar a pessoa fisica porque a pessoa juridica precisa dela
        PessoaFisica pf1 = new PessoaFisica("vilnei",
                "036.789.876-03",
                64996096000L,
                "vilneimartins@gmail.com",
                "Rua X n888 São Paulo SP",
                0);

        //Pessoa jurica extende de Pessoa(para receber suas funções e valores),
        //porem a variavel proprietario recebe seus valores de PessoaFisica,
        //porque toda CNPJ tem que ter um CPF responsavel
        PessoaJuridica pj = new PessoaJuridica(pf1,
                "45367496-1000/03",
                "Rua Z n899 São Paulo SP",
                64996096000L,
                "empresa@empresa.com",
                3);


        //imprimindo apenas os valores do Proprietário dentro de PessoaJuridica.PessoaFisica
        //nesse caso ele vai buscar o toString la em Pessoa
        System.out.println(pj.getProprietario());

        //imprimindo todos os dados dentro de PessoaJuridica com -toString- emitindo apenas o nome do proprietario
        System.out.println(pj);

        //imprimindo PessoaFisica usando o toString proprio para ver as diferenças
        System.out.println(pf1.toStringPessoaFisica());
    }
}
