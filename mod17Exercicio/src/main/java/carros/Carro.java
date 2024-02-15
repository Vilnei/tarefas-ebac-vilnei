package carros;

public abstract class Carro {
    private int potencia;
    private String combustivel;
    private String cor;

    public Carro(int potencia, String combustivel, String cor) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void ligarMotor() {
        System.out.println("O carro selecionado foi da "
                + getClass().getSimpleName());

        System.out.println("O " +
                combustivel +
                " esta sendo injetado no motor, e esta pronto para usar "
                + potencia +
                " de potencia!!");
    }

    public void limpar() {
        System.out.println("O carros.Carro esta sendo limpo, e a cor " +
                cor +
                " esta sendo polida!");
    }

    public void revisaoMecanica() {
        System.out.println("O carro esta passou por uma revisão com um mecanico e esta perfeito!");
    }

    public void abastecer() {
        System.out.println("O carro esta sendo abastecido com " +
                combustivel);
    }

}
