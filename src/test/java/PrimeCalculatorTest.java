import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * This class tests the PrimeCalculator Class.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
class PrimeCalculatorTest {
    private static int amount;

    @BeforeAll
    static void beforeAll() {
        assertTrue(PrimeCalculator.getAmount() == 0);
        amount = 0;
    }

    @Test
    void calculatePrimes() {
    }

    @Test
    void isPrime() {
        int notPrime = 4;
        int prime = 17;
        assertTrue(PrimeCalculator.isPrime(prime));
        assertFalse(PrimeCalculator.isPrime(notPrime));
    }

    @Test
    void setAmount() {
        PrimeCalculator.setAmount(amount);
        assertTrue(PrimeCalculator.getAmount() == amount);
        assertThrows(AssertionError.class, () -> PrimeCalculator.setAmount(-2));
    }

    @Test
    void getAmount() {
        PrimeCalculator.setAmount(amount);
        assertTrue(PrimeCalculator.getAmount() == amount);
    }

    @Test
    void getPRIMES() {
        PrimeCalculator.setAmount(amount);
        PrimeCalculator.calculatePrimes();
        assertTrue(PrimeCalculator.getPRIMES().size() == amount);
        PrimeCalculator.setAmount(0);
        PrimeCalculator.calculatePrimes();
        assertTrue(PrimeCalculator.getPRIMES().size() == 0);

        PrimeCalculator.setAmount(10);
        PrimeCalculator.calculatePrimes();
        LinkedList<Integer> primes = PrimeCalculator.getPRIMES();
        int[] check = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0, primesSize = primes.size(); i < primesSize; i++) {
            int prime = primes.get(i);
            assertTrue(PrimeCalculator.isPrime(prime));
            assertEquals(check[i], prime);
        }
    }
}