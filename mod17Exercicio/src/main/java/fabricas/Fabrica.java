package fabricas;

import carros.Carro;

public abstract class Fabrica {
    public Carro criar(String requerimento) {
        Carro carro = escolherCarro(requerimento);
        carro = prepararCarro (carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro) {
        carro.limpar();
        carro.revisaoMecanica();
        carro.abastecer();
        return carro;
    }
    abstract Carro escolherCarro(String requerimento);
}
