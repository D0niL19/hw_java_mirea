package pract11.n_1_2_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int iDNumber;
    private String name;
    private Date dateOfBirth;
    private double GPA;

    public Student(int iDNumber, String name, Date dateOfBirth, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    public String toString(String format) {
        SimpleDateFormat dateFormat;
        if (format.equals("short")) {
            dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        } else if (format.equals("long")) {
            dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        } else {
            dateFormat = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        }

        String formattedDate = dateFormat.format(dateOfBirth);

        return "pract11.n_1_2_3.pract17.pract18.n1.Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + formattedDate +
                ", GPA=" + GPA +
                '}';
    }


}
