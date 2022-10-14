public class Analyzer {

    public static void checkArgs(String[] args) {
        assert (args.length != 0 && args.length <= 2) : "Anzahl der Argumente ist falsch!";
        assert (Integer.valueOf(args[0]) >= 0) : "Keine gültige Anzahl!";
        setPath(args);
        setAmount(args[0]);
    }

    private static void setAmount(String amount) {
        PrimeCalculator.setAmount(Integer.valueOf(amount));
    }

    private static void setPath(String[] args) {
        String filepath;
        filepath = (args.length == 2 && !args[1].equals(null)) ? args[1] : "default.txt";
        PrimeWriter.setPath(filepath);
    }
}
