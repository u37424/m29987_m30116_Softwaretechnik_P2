import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Time;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

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
    private static int amount;

    @BeforeAll
    static void beforeAll() {
        assertTrue(PrimeCalculator.getAmount() == 0);
        testPath = "test.txt";
        amount = 5;
        PrimeWriter.setPath(testPath);
        try {
            Files.deleteIfExists(Path.of(testPath));
            assertTrue(!Files.exists(Path.of(testPath)));
        } catch (IOException e) {
        }
    }

    @BeforeEach
    void setUp() {
        PrimeCalculator.setAmount(amount);
        PrimeCalculator.calculatePrimes();
        assertTrue(PrimeCalculator.getPRIMES().size() == amount);
    }

    @Test
    void setPath() {
        assertTrue(PrimeWriter.getPath().equals(testPath));
        assertThrows(AssertionError.class, () -> PrimeWriter.setPath(null));
    }

    @Test
    void getPath() {
        assertTrue(PrimeWriter.getPath().equals(testPath));
    }

    @Test
    void writePrimes() {
        PrimeWriter.writePrimes();
        assertTrue(Files.isRegularFile(Path.of(testPath)));
        try {
            FileReader r = new FileReader(testPath);
            String res = "";
            int temp;
            while ((temp = r.read()) != -1) {
                res += (char) temp;
            }
            String[] strprimes = res.split("\\W");
            int[] primes = Arrays.stream(strprimes).mapToInt((i) -> Integer.valueOf(i)).toArray();
            assertTrue(primes.length == amount);
            for (int prime : primes) {
                assertTrue(PrimeCalculator.isPrime(prime));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void tearDown() {
        try {
            Files.deleteIfExists(Path.of(testPath));
            assertTrue(!Files.exists(Path.of(testPath)));
        } catch (IOException e) {
        }
    }
}