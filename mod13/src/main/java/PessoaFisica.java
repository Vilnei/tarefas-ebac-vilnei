public class PessoaFisica extends Pessoa {

    //esses processos estao apenas da "PessoaFisica"
    private Integer processos;

    public PessoaFisica(String nome, String cpf, Long telefone, String email, String endereco,Integer processos){
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setEmail(email);
        setEndereco(endereco);
        this.processos = processos;
    }

    public Integer getProcessos() {
        return processos;
    }

    public void setProcessos(Integer processos) {
        this.processos = processos;
    }

    public String toStringPessoaFisica() {
        return "[PessoaFisica] = [" +
                "Nome = " + getNome() +
                "CPF = " + getCpf() +
                ", Processos = " + processos +
                " ].";
    }
}
