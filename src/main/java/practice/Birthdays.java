package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 1;
        int month = 1;
        int year = 1970;

        System.out.println(collectBirthdays(year, month, day));
    }
    public static String collectBirthdays(int year, int month, int day) {

        String birthday = "";
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern
                ("dd.MM.yyyy - E").localizedBy(new Locale("us"));
        StringBuilder birth = new StringBuilder(birthday);

        for (int i = 0; date.isBefore(today) || date.isEqual(today);
             date = date.plusYears(1)) {
            birth = birth.append(i++ + " - " + formatter.format(date) + System.lineSeparator());
        }
        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        return birth.toString();
    }
}
