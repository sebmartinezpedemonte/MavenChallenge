import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BasicCalendar implements ICalendar {


    private String versionNumber;

    public BasicCalendar(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Override
    public String printTodaysDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    @Override
    public String about() {
        return ". Basic Calendar, version: " + versionNumber;
    }
}
