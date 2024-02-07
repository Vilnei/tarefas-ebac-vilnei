import Car.*;
import Factory.*;

/**
 * @author Vilnei
 */
public class App {

    public static void main(String[] args) {
        Customer cliente = new Customer("A", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ComContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
