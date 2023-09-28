package n1;

public class Test {

    public static void selectionSort (Comparable[] list){
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++){
            min = index;
            for (int scan = index+1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                    temp = list[min];
                    list[min] = list[index];
                    list[index] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(105, "sadf"),
                new Student(103, "sdfgsd"),
                new Student(102, "DGsag"),
                new Student(105, "FJDSJ"),
                new Student(104, "LDMSfs")
        };

        selectionSort(students);
        for(Student s: students){
            System.out.println(s.toString());
        }
    }
}
