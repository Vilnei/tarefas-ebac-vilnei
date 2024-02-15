package fabricas;

import carros.Carro;
import carros.Tesla;
import carros.Toyota;
import fabricas.Fabrica;

public class ComContrato extends Fabrica {

    @Override
    Carro escolherCarro(String requerimento) {
        if ("A".equals(requerimento)) {
            return new Tesla(280,"Eletricidade","Branco");
        } else {
            return new Toyota(180,"Gasolina","Azul");
        }
    }
}
