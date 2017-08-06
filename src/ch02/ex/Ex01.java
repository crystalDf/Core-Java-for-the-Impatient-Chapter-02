package ch02.ex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class Ex01 {

    public static void main(String[] args) {

        for (int i = 7; i <= 13; i++) {
            System.out.printf("%4s", DayOfWeek.of((i > 7) ? (i - 7) : i)
                    .getDisplayName(TextStyle.SHORT, Locale.US));
        }

        System.out.println();

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = 1;

        LocalDate localDate = LocalDate.of(year, month, dayOfMonth);

        for (int i = 0; i < localDate.getDayOfWeek().getValue(); i++) {
            System.out.print("    ");
        }

        while (localDate.getMonthValue() == month) {

            System.out.printf("%4d", localDate.getDayOfMonth());

            if (localDate.getDayOfWeek().getValue() == 6) {
                System.out.println();
            }

            localDate = localDate.plusDays(1);
        }

        System.out.println();
    }
}
