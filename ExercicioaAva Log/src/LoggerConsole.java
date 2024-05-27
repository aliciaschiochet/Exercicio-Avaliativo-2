import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerConsole extends Logger {
    private static final String RESET = "\033[0m";
    private static final String GREEN = "\033[0;32m";
    private static final String YELLOW = "\033[0;33m";
    private static final String RED = "\033[0;31m";

    private String getColor(Level level) {
        return switch (level) {
            case DEBUG -> GREEN;
            case WARNING -> YELLOW;
            case ERROR -> RED;
            default -> RESET;
        };
    }

    @Override
    public void log(Level level, String message) {
        String color = getColor(level);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(color + "[" + timestamp + "] [" + level + "] " + message + RESET);
    }
}
