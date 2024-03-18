import java.util.List;
import java.util.Objects;

/**
 * classe para cria algumas pessoas diferentes
 * @author Vilnei
 */

public class Pessoa {

    private int id;
    private String nome;
    private Integer idade;
    private String nacionalidade;
    private String sexo;

    public Pessoa(int id, String nome, Integer idade, String nacionalidade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.id = id;
    }

    public Pessoa () {
    }

    public List<Pessoa> criarPessoas () {

        Pessoa pessoaUm = new Pessoa(++id,"João", 22 , "Mexicano", "M");
        Pessoa pessoaDois = new Pessoa(++id,"Rafaela", 32, "Americana", "F");
        Pessoa pessoaTres = new Pessoa(++id,"Vilnei", 33, "Brasileiro", "M");
        Pessoa pessoaQuatro = new Pessoa(++id,"Chupisco", 21, "Asiatico", "M");
        Pessoa pessoaCinco = new Pessoa(++id,"Fernanda", 18, "Brasileiro", "F");
        Pessoa pessoaSeis = new Pessoa(++id,"Tiago", 41, "Brasileiro", "M");
        Pessoa pessoaSete = new Pessoa(++id,"Sara", 56, "Colombiano", "F");
        Pessoa pessoaOito = new Pessoa(++id,"Atrio", 27, "Mexicano", "M");
        Pessoa pessoaNove = new Pessoa(++id,"Chuck", 22, "Americano", "M");
        Pessoa pessoaDez = new Pessoa(++id,"Biranbal", 35, "Africano", "M");

        return List.of(pessoaUm, pessoaDois, pessoaTres, pessoaQuatro,
                pessoaCinco, pessoaSeis, pessoaSete,
                pessoaOito, pessoaNove, pessoaDez);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\n" +"Pessoa " + id +
                " = (nome:'" + nome + '\'' +
                ", idade:" + idade +
                ", nacionalidade:'" + nacionalidade + '\'' +
                ", sexo:'" + sexo + '\'' +
                ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(idade, pessoa.idade) && Objects.equals(nacionalidade, pessoa.nacionalidade) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade, nacionalidade, sexo);
    }
}
