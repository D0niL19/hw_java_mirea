package pract3.n4;

import java.util.Random;
import java.util.Scanner;

public class n4 {
    public static void main(String[] args){
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n < 1){
            n = scanner.nextInt();
        }
        int[] arr = new int[n];

        int size2 = 0;
        for (int i = 0; i < n; i++){
            arr[i] = random.nextInt(n + 1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0){
                size2 += 1;
            }
        }
        System.out.println();

        int[] arr2 = new int[size2];
        int cnt = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                arr2[cnt] = arr[i];
                System.out.print(arr2[cnt] + " ");
                cnt += 1;

            }
        }

    }
}
