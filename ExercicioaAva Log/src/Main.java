public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = LoggerFactory.onConsole();
        Logger fileLogger = LoggerFactory.onFile("log.txt");

        consoleLogger.log(Level.DEBUG, "DEBUG");
        consoleLogger.log(Level.WARNING, "WARNING");
        consoleLogger.log(Level.ERROR, "ERROR");

        fileLogger.log(Level.DEBUG, "DEBUG");
        fileLogger.log(Level.WARNING, "WARNING");
        fileLogger.log(Level.ERROR, "ERROR");
    }
}
