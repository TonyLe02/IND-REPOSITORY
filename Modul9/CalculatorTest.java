import static org.junit.Assert.*; // Importerer assert-metodene fra JUnit-biblioteket
import org.junit.Test; // Importerer Test-annotasjonen fra JUnit-biblioteket

public class CalculatorTest {
    @Test
    public void testAdd() { // Testmetode for add-metoden i Calculator-klassen
        Calculator calculator = new Calculator(); // Oppretter en instans av Calculator-klassen
        int result = calculator.add(2, 3); // Kaller add-metoden med argumentene 2 og 3, og lagrer resultatet i en variabel
        assertEquals(5, result); // Sjekker at resultatet er lik 5 ved hjelp av assert-metoden assertEquals
    }

    @Test
    public void testMultiply() { // Testmetode for multiply-metoden i Calculator-klassen
        Calculator calculator = new Calculator(); // Oppretter en instans av Calculator-klassen
        int result = calculator.multiply(2, 3); // Kaller multiply-metoden med argumentene 2 og 3, og lagrer resultatet i en variabel
        assertEquals(6, result); // Sjekker at resultatet er lik 6 ved hjelp av assert-metoden assertEquals
    }
}
