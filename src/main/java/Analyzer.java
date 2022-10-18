/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * This class analyses the given arguments and set them for the rest of the program.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
public class Analyzer {
    /**
     * Checks if the program works with the given arguments.
     * @param args given arguments
     */
    public static void checkArgs(String[] args) {
        assert (args.length != 0 && args.length <= 2) : "Anzahl der Argumente ist falsch!";
        assert (Integer.valueOf(args[0]) >= 0) : "Keine gültige Anzahl!";
        setPath(args);
        setAmount(Integer.valueOf(args[0]));
    }

    /**
     * Sets the amount of wanted primes.
     * @param amount amount of wanted primes
     */
    public static void setAmount(int amount) {
        assert (amount >= 0) : "Keine gültige Anzahl.";
        PrimeCalculator.setAmount(amount);
    }

    /**
     * Checks if there is a path with a filename given; otherwise the filename in default.txt.
     * @param args given arguments
     */
    public static void setPath(String[] args) {
        String filepath;
        filepath = (args.length == 2 && !args[1].equals(null)) ? args[1] : "default.txt";
        PrimeWriter.setPath(filepath);
    }
}
