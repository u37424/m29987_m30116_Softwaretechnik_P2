import java.util.LinkedList;

public class PrimeCalculator {
    private static int amount;

    private static final LinkedList<Integer> PRIMES = new LinkedList<>();

    public static void calculatePrimes() {
        int current = 2;
        while (PRIMES.size() < getAmount()) {
            if (isPrime(current)) PRIMES.add(current);
            current++;
        }
    }

    private static boolean isPrime(int current) {
        for (int i = 2; i <= current / 2; ++i) {
            if (current % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void setAmount(int amount) {
        PrimeCalculator.amount = amount;
    }

    public static int getAmount() {
        return amount;
    }

    public static LinkedList<Integer> getPRIMES() {
        return PRIMES;
    }
}
