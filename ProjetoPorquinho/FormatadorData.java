import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorData {
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public static String formatar(LocalDateTime data) {
        return data.format(FORMATADOR);
    }
}
