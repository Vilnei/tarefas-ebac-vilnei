package Factory;

import Car.*;

/**
 * @author Vilnei
 */
public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Classic(72, "full", "white");
        } else {
            return null;
        }
    }
}
