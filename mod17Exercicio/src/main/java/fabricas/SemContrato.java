package fabricas;

import carros.Carro;
import carros.Chevrolet;
import carros.Ford;
import fabricas.Fabrica;

public class SemContrato extends Fabrica {
    @Override
    Carro escolherCarro(String requerimento) {
        if ("B".equals(requerimento)) {
            return new Ford(120,"Alcool","Vermelho");
        } else {
            return new Chevrolet(72,"Gasolina","Branco");
        }
    }
}
