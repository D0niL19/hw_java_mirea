package pract8.n16;

import java.util.Scanner;

//[cnt, max]
public class Main {
    public static int[] max_cnt(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0){
            return new int[]{0, 0};
        }
        int[] b = max_cnt();

        if (a > b[1]){
            return new int[]{1,a};
        } else if (a < b[1]) {
            return new int[]{b[0], b[1]};
        }
        else {
            return new int[]{b[0] + 1, b[1]};
        }
    }


    public static void main(String[] args) {
        System.out.println(max_cnt()[0]);
    }
}
