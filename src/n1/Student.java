package n1;

public class Student implements Comparable<Student>{
    String name;
    int id;

    public Student(int id, String name) {
        this.name = name;

        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
