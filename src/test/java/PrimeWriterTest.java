import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * This class tests the PrimeWriter Class.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
class PrimeWriterTest {
    private static String testPath;
    @BeforeAll
    static void beforeAll() {
        assertTrue(PrimeCalculator.getAmount() == 0);
        testPath = "test.txt";
    }

    @Test
    void setPath() {
        PrimeWriter.setPath(testPath);
        assertTrue(PrimeWriter.getPath().equals(testPath));
        assertThrows(AssertionError.class, () -> PrimeWriter.setPath(null));
    }

    @Test
    void getPath() {
        PrimeWriter.setPath(testPath);
        assertTrue(PrimeWriter.getPath().equals(testPath));
    }

    @Test
    void writePrimes() {
    }
}