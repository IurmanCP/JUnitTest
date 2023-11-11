import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    private Calculator calculadora = new Calculator();


    @BeforeEach
    public void resetearVariablesParaCadaTest(){

    }
    @Test
    public void additionTest(){
        int resultado = calculadora.addition(3,2);
        assertEquals(5,resultado);
    }

    @Test
    public void divideTestConYDeferenteDe0Test(){
        int resultado = calculadora.divide(6,3);
        assertEquals(2,resultado);
    }

    @Test
    public void diviveTestCoYigualA0Test(){
        int resultado = calculadora.divide(6,0);
        assertEquals(0,resultado);
    }

    @Test
    public void  esParTest(){
        boolean resultado = calculadora.esPar(6);
        assertTrue(resultado);
    }
}

