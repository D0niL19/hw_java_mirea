package pract8.n17;

import java.util.Scanner;

public class Main {
    public static int max_cnt(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0){
            return 0;
        }
        int b = max_cnt();
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {


        System.out.println(max_cnt());
    }
}
