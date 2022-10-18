/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * The class is used to start and coordinate the entire programm.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
public class Application {
    /**
     * Activates all the other parts of the programm and coordinate when the tasks starts.
     * @param args given arguments
     */
    public static void main(String[] args) {
        Analyzer.checkArgs(args);
        System.out.println("Analyzed arguments.");
        PrimeCalculator.calculatePrimes();
        System.out.println("Calculated Primes.");
        PrimeWriter.writePrimes();
        System.out.println("Written to File.");
    }
}
