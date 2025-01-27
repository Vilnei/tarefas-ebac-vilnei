import br.com.vilnei.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {

    Calculadora calcular = new Calculadora();

    @Test
    public void testarAdicionar() {
        int resultado = calcular.adicionar(2,4);
        assertEquals (6, resultado);
    }

    @Test
    public void testarSubtrair() {
        int resultado = calcular.subtrair(2,4);
        assertEquals (-2, resultado);
    }

    @Test
    public void testarMultiplicar() {
        int resultado = calcular.multiplicar(2,4);
        assertEquals (8, resultado);
    }

    @Test
    public void testarDividir() {
        double resultado = calcular.dividir(8,4);
        assertEquals (2,0.01,resultado);
    }

    @Test
    public void testarDividirPorZero () {

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(10.0, 0);
        });

        assertEquals("Divisão por ZERO não e possivel", exception.getMessage());
    }

}
