package logs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vilnei
 * @param <T>
 */
public class Logs<T> {
    private int contador;
    List<T> logs = new ArrayList<>();

    public Logs(T referencia) {
        logs.add(referencia);
        this.contador ++;
        //salvar em um BD todas as vezes que for gerada um novo Objeto carro
        System.out.println("No momentos ja essa aplicação foi executada " +
                contador +
                " vezes, e esses são os objetos na lista:\n" +
                logs);
    }

}
