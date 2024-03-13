package test;

import ejercicios.Ordenamiento;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class OrdenamientoTest {
    @Test
    public void testNo() {
        String valorEsperado = "0 1 6 7";
        String valorActual = Ordenamiento.evaluar(7, 0, 6, 1);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
    @Test
    public void testN1() {
        String valorEsperado = "1 2 3 4";
        String valorActual = Ordenamiento.evaluar(1, 2, 3, 4);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testN2() {
        String valorEsperado = "-4.33 -4 3 1000";
        String valorActual = Ordenamiento.evaluar(1000, -4, (int) -4.33, 3);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testN3() {
        String valorEsperado = "-0.5 0 0.5 25";
        String valorActual = Ordenamiento.evaluar((int)0.5, 25, (int)-0.5, 0);
        assertEquals(valorEsperado, valorActual);
    }
}
