import java.lang.annotation.*;

@Documented//para que essa anotação aparece no javaDoc
@Retention(RetentionPolicy.RUNTIME)//para que essa anotação seja ultimo em tempo de execução
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})//onde essa anotação pode ser usada
public @interface PrimeiraAnotacao {

    String value();//se so tiver um parametro ele orbigatoriamente tem que se chamar value

    String[] listaDeNumeros();//pode ser usado com lista

    long numero() default 15;//tem que ser do tipo primitivo e posso usar o default para ter um valor padrao

}
