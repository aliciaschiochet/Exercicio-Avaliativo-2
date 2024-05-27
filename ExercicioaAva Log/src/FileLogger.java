import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger extends Logger {
    private PrintWriter writer;

    public FileLogger(String filename) {
        try {
            writer = new PrintWriter(new FileWriter(filename, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(Level level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        writer.println("[" + timestamp + "] [" + level + "] " + message);
        writer.flush();
    }
}
