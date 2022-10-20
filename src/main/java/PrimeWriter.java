import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * This class prints the calculated primes into the file.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
public class PrimeWriter {
    private static String path;

    /**
     * Writes the path in with the file is going to be saved.
     * @param path chosen path
     */
    public PrimeWriter(String path) {
        this.path = path;
    }

    /**
     * Sets the path in with the file is going to be saved.
     * @param path chosen path
     */
    public static void setPath(String path) {
        assert (path != null && path != "") : "Empty Path!";
        PrimeWriter.path = path;
    }

    /**
     * Gets the path in with the file is going to be saved.
     * @return the chosen path
     */
    public static String getPath() {
        return path;
    }

    /**
     * Writes all the calculated primes into the file.
     * @return if the task has succeeded od failed.
     */
    public static boolean writePrimes() {
        try {
            FileWriter writer = new FileWriter(getPath());
            LinkedList<Integer> primes = PrimeCalculator.getPRIMES();
            assert primes.size() == PrimeCalculator.getAmount() : "Error in Prime-List.";
            for (int prime : primes) {
                writer.write(prime + " ");
            }
            writer.flush();
            return true;
        } catch (IOException e) {
            System.err.println("Error during the writing process.");
        }
        return false;
    }
}
