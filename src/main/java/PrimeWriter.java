import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class PrimeWriter {
    private static String path;

    public PrimeWriter(String path) {
        this.path = path;
    }

    public static void setPath(String path) {
        PrimeWriter.path = path;
    }

    public static String getPath() {
        return path;
    }

    public static void writePrimes() {
        try {
            FileWriter writer = new FileWriter(getPath());
            LinkedList<Integer> primes = PrimeCalculator.getPRIMES();
            assert primes.size() == PrimeCalculator.getAmount() : "Error in Prime-List.";
            for (int prime : primes) {
                writer.write(prime+" ");
            }
            writer.flush();
        } catch (IOException e){

        }
    }
}
