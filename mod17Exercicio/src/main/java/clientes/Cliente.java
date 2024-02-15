package clientes;

public class Cliente {

    private String requerimento;
    private boolean contrato;

    public Cliente (String requerimento, boolean contrato) {
        this.requerimento = requerimento;
        this.contrato = contrato;
    }
    public boolean comtrato() {
        return contrato;
    }
    public String requerimento() {
        return requerimento;
    }
}
