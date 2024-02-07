package Factory;

import Car.*;

/**
 * @author Vilnei
 */
public class ComContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Gipe(121, "full", "green");
        } else {
            return null;
        }
    }
}
