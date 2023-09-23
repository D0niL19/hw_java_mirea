package pract3.n5;

public class n5 {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Maxim", 98432.132f);
        employees[1] = new Employee("Igor", 235.14f);
        employees[2] = new Employee("Sergey", 423.512f);
        Report.generateReport(employees);
    }
}
