public class Application {

    public static void main(String[] args) {
        Analyzer.checkArgs(args);
        PrimeCalculator.calculatePrimes();
        PrimeWriter.writePrimes();
    }
}
