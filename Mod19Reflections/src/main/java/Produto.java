/**
 * @author Vilnei
 */
@Tabela(value = "annotation da classe")
public class Produto {
    @Tabela
    private Long codigo;
    private String descricao;
    private Double valor;

    @Tabela(value = "annotation do construtor")
    public Produto() {

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
