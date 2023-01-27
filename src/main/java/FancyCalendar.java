import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FancyCalendar implements ICalendar{

    private String versionNumber;

    public FancyCalendar(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Override
    public String printTodaysDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    @Override
    public String about() {
        return ". Fancy Calendar version: " +  versionNumber;
    }
}
