package pract3.n5;

public class Employee {
    String fullname;
    float salary;

    public Employee(String fullname, float salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public float getSalary() {
        return salary;
    }
}
