package practice;

import java.time.LocalDate;
import java.time.Period;

public class Periods {

    public static void main(String[] args) {

        LocalDate firstDay = LocalDate.now();
        LocalDate secondDate = LocalDate.of(1970, 1, 1);

        System.out.println(getPeriodFromBirthday(firstDay, secondDate));
    }
    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {

        String text = "";

        Period dif = Period.between(firstDate, secondDate);

        StringBuilder df = new StringBuilder(text);
        df = df.append("years:" + dif.getYears() + ", months:" + dif.getMonths() + ", days:" + dif.getDays());

        return df.toString();
    }
}
