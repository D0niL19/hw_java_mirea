package pract3.n5;

import java.util.Formatter;

public class Report {


    static void generateReport(Employee[] employees){
        Formatter formatter = new Formatter();
        for (Employee el : employees){
            System.out.printf("Salary of %10s is: %10.2f%n", el.getFullname(), el.getSalary());
            //System.out.printf("'%20.2f'%n", el.getSalary());
        }
    }
}
