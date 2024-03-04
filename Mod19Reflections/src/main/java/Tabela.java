import java.lang.annotation.*;

/**
 * @author Vilnei
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface Tabela {
    String value() default "Buncalabum";
}
