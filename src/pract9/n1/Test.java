package pract9.n1;

import java.util.Arrays;

public class Test {
    private Student[] students1, students2;

    public void setArray1(Student[] students) {
        this.students1 = students;
    }

    public void setArray2(Student[] students) {
        this.students2 = students;
    }

    public void outArray1() {
        for (Student student : students1) {
            System.out.println(student);
        }
    }
    public void outArray2() {
        for (Student student : students2) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student st = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(st) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = st;
        }
    }

    public static Student[] mergeSort(Student[] array1, Student[] array2) {
        Student[] mergedArray = new Student[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i].compareTo(array2[j]) < 0) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            //System.out.println(mergedArray[k]);
            k++;
        }

        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }


    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", "Smith", "Computer Science", 105, 1, 1, 88.5),
                new Student("Bob", "Johnson", "Physics", 108, 2, 2, 92.0),
                new Student("Charlie", "Brown", "Mathematics", 103, 1, 1, 78.2),
                new Student("David", "Lee", "Chemistry", 102, 3, 2, 85.5),
                new Student("Eve", "Davis", "Biology", 101, 2, 3, 90.1)
        };
        Student[] students_new = {
                new Student("John", "Doe", "History", 204, 2, 1, 75.5),
                new Student("Mary", "Johnson", "Mathematics", 201, 3, 2, 88.0),
                new Student("William", "Smith", "Physics", 203, 1, 2, 92.3),
                new Student("Emily", "Brown", "Computer Science", 209, 4, 3, 81.1),
                new Student("Michael", "Davis", "Biology", 205, 2, 1, 90.5)
        };

        Test test = new Test();
        test.setArray1(students);
        test.setArray2(students_new);

        System.out.println("Unsorted Students:");
        test.outArray1();

        insertionSort(test.students1);

        System.out.println("\nSorted Students by IDNumber:");
        test.outArray1();


        System.out.println("\n\nUnsorted Students:");
        test.outArray2();

        Arrays.sort(test.students2 , new SortingStudentsByGPA());

        System.out.println("\nSorted Students by IDNumber:");
        test.outArray2();

        insertionSort(test.students2);

        Student[] mergedArray = mergeSort(test.students1, test.students2);

        System.out.println("\n\nMerged and Sorted Students:");
        for (Student student : mergedArray) {
            System.out.println(student);
        }


    }
}
