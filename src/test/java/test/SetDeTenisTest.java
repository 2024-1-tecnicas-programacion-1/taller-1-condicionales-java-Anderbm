package test;

import ejercicios.SetDeTenis;
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
public class SetDeTenisTest {
    @Test
    public void testAunNoTermina() {
        String valorEsperado = "Aún no termina";
        String valorActual = SetDeTenis.evaluar(4, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
    @Test
    public void testGanoB() {
        String valorEsperado = "Ganó B";
        String valorActual = SetDeTenis.evaluar(5, 7);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testGanoA() {
        String valorEsperado = "Ganó A";
        String valorActual = SetDeTenis.evaluar(6, 4);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testInvalido() {
        String valorEsperado = "Inválido";
        String valorActual = SetDeTenis.evaluar(3, 7);
        assertEquals(valorEsperado, valorActual);
    }
}
