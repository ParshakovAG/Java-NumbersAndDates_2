package practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Periods {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate javaYear = LocalDate.of(1970, 1, 1);
        Period dif = Period.between(javaYear, today);
//        System.out.print("years:" + javaYear.until(today, ChronoUnit.YEARS) + ", ");
//        System.out.print("months:" +javaYear.until(today, ChronoUnit.MONTHS) + ", ");
//        System.out.print("days:" + javaYear.until(today, ChronoUnit.DAYS));
        System.out.println(dif);
    }
    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {

        String text = "";
        LocalDate today = LocalDate.now();
        LocalDate javaYear = LocalDate.of(1970, 1, 1);

        Period dif = Period.between(javaYear, today);

        StringBuilder df = new  StringBuilder(text);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("years: , months: , days: ");
        //df = df.append(" - " + formatter.format(today) + System.lineSeparator());

        return text.toString();
    }

}
