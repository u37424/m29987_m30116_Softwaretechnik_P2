import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzerTest {
    private static String testpath = "Test.txt";

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
        Analyzer.setPath(new String[]{"0",testpath});
        assertTrue(PrimeWriter.getPath().equals(testpath));
        Analyzer.setPath(new String[]{"0"});
        assertTrue(PrimeWriter.getPath().equals("default.txt"));
        assertDoesNotThrow(() -> Analyzer.setPath(new String[]{}));
    }

    @Test
    void checkArgs() {
        int amount = 10;
        Analyzer.checkArgs(new String[]{Integer.toString(amount), testpath});
        assertTrue(PrimeCalculator.getAmount() == amount);
        assertTrue(PrimeWriter.getPath().equals(testpath));
        Analyzer.checkArgs(new String[]{Integer.toString(amount)});
        assertTrue(PrimeCalculator.getAmount() == amount);
        assertTrue(PrimeWriter.getPath().equals("default.txt"));
        assertThrows(NumberFormatException.class, () -> Analyzer.checkArgs(new String[]{null}));
        assertThrows(AssertionError.class, () -> Analyzer.checkArgs(new String[]{}));
    }
}