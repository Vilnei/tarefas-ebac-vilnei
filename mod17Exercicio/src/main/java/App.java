import carros.*;
import clientes.*;
import fabricas.*;
import logs.Logs;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("B", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.criar(cliente.requerimento());
        carro.ligarMotor();

        //adicionando uma lista com todos os tipos de carros para testa a lista generica
        List<Carro> listaDeCarros = new ArrayList<>();
        Chevrolet corsa = new Chevrolet(72,"Alcool","Branco");
        Ford furgao = new Ford(165, "Gasolina", "Cinza");
        Tesla modelX = new Tesla(180,"Eletricidade", "Vermelho");
        Toyota corolla = new Toyota(175,"Gasolina", "Prata");
        listaDeCarros.add(corsa);
        listaDeCarros.add(furgao);
        listaDeCarros.add(modelX);
        listaDeCarros.add(corolla);


        Logs logs = new Logs(carro);// um primeira ideia de um log so pra testa algumas coisas


    }

    private static Fabrica getFabrica(Cliente cliente) {
        if (cliente.comtrato()) {
            return new ComContrato();
        } else {
            return new SemContrato();
        }
    }
}
