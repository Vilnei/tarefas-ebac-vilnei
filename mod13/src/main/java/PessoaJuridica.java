
//a classe PessoaJuridica esta estendo de Pessoas mas n esta usado nada de la porque eu resolvi testa a ideia de
//fazer uma variavel recebendo um objeto de outra class
//mas poderia usar a equal e hash da calsse Pessoa ou outra função especifica
public class PessoaJuridica extends Pessoa{

    private PessoaFisica proprietario;
    private String cnpj;
    private String enderecoEmpresa;
    private Long telefoneEmpresa;
    private String emailEmpresa;
    //esses processos esta apenas dentro da "Empresa"
    private Integer processos;

    public PessoaJuridica(PessoaFisica proprietario,
                          String cnpj,
                          String enderecoEmpresa,
                          Long telefoneEmpresa,
                          String emailEmpresa,
                          Integer processos) {
        this.proprietario = proprietario;
        this.cnpj = cnpj;
        this.enderecoEmpresa = enderecoEmpresa;
        this.telefoneEmpresa = telefoneEmpresa;
        this.emailEmpresa = emailEmpresa;
        this.processos = processos;
    }

    public Integer totalProcessos() {
        return processos + proprietario.getProcessos();
    }

    public PessoaFisica getProprietario() {
        return proprietario;
    }

    public void setProprietario(PessoaFisica proprietario) {
        this.proprietario = proprietario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public Long getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(Long telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public Integer getProcessos() {
        return processos;
    }

    public void setProcessos(Integer processos) {
        this.processos = processos;
    }

    @Override
    public String toString() {
        return "[PessoaJuridica] = [" +
                "Nome dos Proprietários = " + proprietario.getNome() +
                ", CNPJ = " + cnpj +
                ", Endereco da Sede = " + enderecoEmpresa +
                ", Telefone da Sede = " + telefoneEmpresa +
                ", Email = " + emailEmpresa +
                ", Processos = " + totalProcessos() +
                " ].";
    }
}
