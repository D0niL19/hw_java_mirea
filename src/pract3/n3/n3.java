package pract3.n3;

import java.util.Random;

public class n3 {
    public static void main(String[] args){
        Boolean bool = new Boolean(true);
        Random random = new Random();
        int size = 4;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < size - 1; i++){
            if (arr[i] >= arr[i + 1]){
                bool = false;
                break;
            }
        }
        System.out.println(bool);

    }
}
