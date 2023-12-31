/**
 * Classe referente a produto e teste de javadoc
 * @author Vilnei
 */
public class Produto {
    private int id;
    private double valor;
    private int quantidade;

    /**
     * primeiro contrutor criado e comentario no momento é apenas para teste
     * @param id para guarda o codigo do produto
     * @param valor para guardar o valor unitario do item
     * @param quantidade para quantidades em estoque
     */
    Produto(int id, double valor, int quantidade) {
        this.id = id;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * só para testa o javadoc e toString e Override
     * @return uma versao mais "bonita" no console
     */
    @java.lang.Override
    public String toString() {
        return "Produto\n" +
                "   id = " + id + "\n" +
                "   valor unitario = " + valor + "\n" +
                "   quantidade em estoque = " + quantidade;
    }
}
