import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * This class tests the Analyzer Class.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
class AnalyzerTest {
    private static String testPath;

    @BeforeAll
    static void beforeAll() {
        assertTrue(PrimeCalculator.getAmount() == 0);
        testPath = "test.txt";
    }

    @Test
    void setAmount() {
        Analyzer.setAmount(12);
        assertTrue(PrimeCalculator.getAmount() == 12);
        Analyzer.setAmount(0);
        assertTrue(PrimeCalculator.getAmount() == 0);
        assertThrows(AssertionError.class, () -> Analyzer.setAmount(-2));
    }

    @Test
    void setPath() {
        Analyzer.setPath(new String[]{"0",testPath});
        assertTrue(PrimeWriter.getPath().equals(testPath));
        Analyzer.setPath(new String[]{"0"});
        assertTrue(PrimeWriter.getPath().equals("default.txt"));
        assertDoesNotThrow(() -> Analyzer.setPath(new String[]{}));
    }

    @Test
    void checkArgs() {
        int amount = 10;
        Analyzer.checkArgs(new String[]{Integer.toString(amount), testPath});
        assertTrue(PrimeCalculator.getAmount() == amount);
        assertTrue(PrimeWriter.getPath().equals(testPath));
        Analyzer.checkArgs(new String[]{Integer.toString(amount)});
        assertTrue(PrimeCalculator.getAmount() == amount);
        assertTrue(PrimeWriter.getPath().equals("default.txt"));
        assertThrows(NumberFormatException.class, () -> Analyzer.checkArgs(new String[]{null}));
        assertThrows(AssertionError.class, () -> Analyzer.checkArgs(new String[]{}));
    }
}