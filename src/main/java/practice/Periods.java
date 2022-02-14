package practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Periods {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate javaYear = LocalDate.of(1970, 1, 1);

        System.out.println(getPeriodFromBirthday(javaYear, today));
    }
    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {

        String text = "";
        LocalDate today = LocalDate.of(1995, 5, 23);
        LocalDate javaYear = LocalDate.of(2021, 11, 1);

        Period dif = Period.between(today, javaYear);
        StringBuilder dtf = new  StringBuilder(text);

        dtf = dtf.append("years:" + dif.getYears() + ", months:" + dif.getMonths() + ", days:" + dif.getDays());

        return dtf.toString();
    }

}
