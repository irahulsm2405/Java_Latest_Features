package Java_8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeApi {
    public static void main(String[] args) {

        // Get current date/time
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(date);        // 2025-08-12
        System.out.println(time);        // 09:15:30.123
        System.out.println(dateTime);    // 2025-08-12T09:15:30.123
        System.out.println(zonedDateTime); // 2025-08-12T09:15:30.123+05:30[Asia/Kolkata]

        // Custom date
        LocalDate customDate = LocalDate.of(2025, Month.DECEMBER, 25);
        System.out.println(customDate); // 2025-12-25

        // Add / Subtract
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);

        System.out.println(nextWeek);
        System.out.println(lastMonth);

        // Difference between dates
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2025, 8, 12);

        Period diff = Period.between(start, end);
        System.out.println(diff.getYears() + " years " +
                diff.getMonths() + " months " +
                diff.getDays() + " days");

        // Formatting & parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime now = LocalDateTime.now();

        // Format
        String formatted = now.format(formatter);
        System.out.println(formatted); // e.g., 12-08-2025 09:15

        // Parse
        LocalDateTime parsed = LocalDateTime.parse("25-12-2025 10:30", formatter);
        System.out.println(parsed);

        // Instant for timestamps
        Instant timestamp = Instant.now();
        System.out.println(timestamp); // 2025-08-12T03:45:00.123Z

        // Convert between old & new API
        Date oldDate = new Date();
        Instant instant = oldDate.toInstant();
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        // New to old
        Date convertedBack = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
    }
}
