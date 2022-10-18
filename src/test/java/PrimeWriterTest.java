import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeWriterTest {
    private static String testpath = "Test.txt";

    @Test
    void setPath() {
        PrimeWriter.setPath(testpath);
        assertTrue(PrimeWriter.getPath().equals(testpath));
        assertThrows(AssertionError.class, () -> PrimeWriter.setPath(null));
    }

    @Test
    void getPath() {
        PrimeWriter.setPath(testpath);
        assertTrue(PrimeWriter.getPath().equals(testpath));
    }

    @Test
    void writePrimes() {
    }
}