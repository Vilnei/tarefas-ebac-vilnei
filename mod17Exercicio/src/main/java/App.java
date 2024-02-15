import carros.*;
import clientes.*;
import fabricas.*;
import logs.Logs;


public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("B", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.criar(cliente.requerimento());
        carro.ligarMotor();
        //salvaria em um BD quantas vezes foram criados carros e o Objeto carro.
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
