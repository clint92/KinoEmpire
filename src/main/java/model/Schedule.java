package model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Martin H on 16-03-2017.
 */


public class Schedule {
    private String formatDateTime = dateTime();
    public Schedule() {

    }

    private String dateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-HH:mm:ss"); //yyyy
        return now.format(formatter);
    }

    public String getFormatDateTime() {
        return formatDateTime;
    }

    public void setFormatDateTime(String formatDateTime) {
        this.formatDateTime = formatDateTime;
    }
}
