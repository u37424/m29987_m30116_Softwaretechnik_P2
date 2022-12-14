/**
 * AWT-DEMO 2022
 *
 * @version 1.0
 * <p>
 * The class is used to start and coordinate the entire program.
 * </p>
 * @author: m30116 Sebastian Siebert
 * @author: m29887 Luca Joel Spirka
 */
public class Application {
    /**
     * Activates all the other parts of the program and coordinates when the tasks run.
     * @param args given arguments
     */
    public static void main(String[] args) {
        Analyzer.checkArgs(args);
        System.out.println("Analyzed arguments.");
        PrimeCalculator.calculatePrimes();
        System.out.println("Calculated Primes.");
        if(PrimeWriter.writePrimes()) System.out.println("Written to File.");
        else System.out.println("Failed to Write.");
    }
}
