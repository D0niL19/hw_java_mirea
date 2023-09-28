package pract8.n15;

import java.util.Scanner;

public class Main {

    public static void reverse(int n){
        if(n / 10 == 0){
            System.out.println(n);
        }
        else{
            System.out.println(n % 10);
            reverse(n / 10);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        reverse(scanner.nextInt());
    }
}
