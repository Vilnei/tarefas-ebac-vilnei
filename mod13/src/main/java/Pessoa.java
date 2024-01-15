import java.util.Objects;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private Long telefone;
    private String email;
    private String endereco;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "[PESSOA] = [" +
                "Nome = " + nome +
                ", Cpf = " + cpf +
                ", Telefone = " + telefone +
                ", Email = " + email +
                ", Endereço = " + endereco +
                " ].";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(cpf, pessoa.cpf) && Objects.equals(telefone, pessoa.telefone) && Objects.equals(email, pessoa.email) && Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, telefone, email, endereco);
    }
}
