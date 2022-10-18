public class Application {

    public static void main(String[] args) {
        Analyzer.checkArgs(args);
        System.out.println("Analyzed arguments.");
        PrimeCalculator.calculatePrimes();
        System.out.println("Calculated Primes.");
        PrimeWriter.writePrimes();
        System.out.println("Written to File.");
    }
}
