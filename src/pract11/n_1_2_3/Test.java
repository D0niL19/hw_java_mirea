package pract11.n_1_2_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;


public class Test {
    public static void main(String[] args) {

        Date currentDate = new Date();
        Date startDate = new Date(2023, Calendar.SEPTEMBER, 1);
        System.out.println("Фамилия разработчика: Коротков");
        System.out.println("Дата и время получения задания: " + startDate);
        System.out.println("Дата и время сдачи задания: " + currentDate);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время (ГГГГ-ММ-ДД ЧЧ:мм):");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String userInput = scanner.nextLine();
        try {
            Date userDate = dateFormat.parse(userInput);
            Date now = new Date();
            if (userDate.before(now)) {
                System.out.println("Введенная дата прошла.");
            } else if (userDate.after(now)) {
                System.out.println("Введенная дата в будущем.");
            } else {
                System.out.println("Введенная дата совпадает с текущей.");
            }
        } catch (Exception e) {
            System.out.println("Неверный формат даты и времени.");
        }


        Date birthDate = new Date(95, 0, 15); // Год - 1995, месяц - январь (0), день - 15
        Student student = new Student(101, "Alice", birthDate, 3.7);

        System.out.println(student.toString("long"));
        System.out.println(student.toString("mid"));
        System.out.println(student.toString("short"));
    }
}