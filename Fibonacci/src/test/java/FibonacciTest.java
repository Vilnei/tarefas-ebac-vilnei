import br.com.vilnei.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    Fibonacci fibo = new Fibonacci();

    @Test
    public void encontrarPraUm () {
        int fibonacci = fibo.encontrarElemento(1);
        Assert.assertEquals(1, fibonacci);
    }

    @Test
    public void encontrarPraDois () {
        int fibonacci = fibo.encontrarElemento(2);
        Assert.assertEquals(1, fibonacci);
    }

    @Test
    public void encontrarPraTres () {
        int fibonacci = fibo.encontrarElemento(3);
        Assert.assertEquals(2, fibonacci);
    }

    @Test
    public void encontrarPraNove () {
        int fibonacci = fibo.encontrarElemento(9);
        Assert.assertEquals(34, fibonacci);
    }
}
