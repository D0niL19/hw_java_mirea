package pract9.n1;

public class Student implements Comparable<Student>{
    String name, surname, special;
    int id, course, group;
    double exam;


    public Student(String name, String surname, String special, int id, int course, int group, double exam) {
        this.name = name;
        this.surname = surname;
        this.special = special;
        this.id = id;
        this.course = course;
        this.group = group;
        this.exam = exam;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "pract11.n_1_2_3.pract17.pract18.n1.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", special='" + special + '\'' +
                ", id=" + id +
                ", course=" + course +
                ", group=" + group +
                ", exam=" + exam +
                '}';
    }

    public double getExam() {
        return exam;
    }
}
