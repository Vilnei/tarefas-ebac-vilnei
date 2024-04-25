package anotacao;

import java.lang.annotation.*;

/**
 * @author Vilnei
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();

}
