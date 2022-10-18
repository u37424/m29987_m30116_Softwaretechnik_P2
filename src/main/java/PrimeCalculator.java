import java.util.LinkedList;
/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * This class calculates every prime number until the wanted number of primes is reached.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
public class PrimeCalculator {
    private static int amount;

    private static final LinkedList<Integer> PRIMES = new LinkedList<>();

    /**
     * Counts the numbers upwards and check if they are primes. If so, they will be added to the List.
     */
    public static void calculatePrimes() {
        int current = 2;
        while (PRIMES.size() < getAmount()) {
            if (isPrime(current)) PRIMES.add(current);
            current++;
        }
    }

    /**
     * This method checks if the incoming number is a prime number or not.
     * @param current current number to check
     * @return if the number is a prime number or not
     */
    public static boolean isPrime(int current) {
        for (int i = 2; i <= current / 2; ++i) {
            if (current % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sets the amount of primes wanted.
     * @param amount amount of primes
     */
    public static void setAmount(int amount) {
        assert amount >= 0 : "No Valid Amount.";
        PrimeCalculator.amount = amount;
    }

    /**
     * Gets the amount of primes wanted.
     * @return amount of primes
     */
    public static int getAmount() {
        return amount;
    }

    /**
     * LinkedList with the numbers of all primes.
     * @return List with all primes
     */
    public static LinkedList<Integer> getPRIMES() {
        return PRIMES;
    }
}
