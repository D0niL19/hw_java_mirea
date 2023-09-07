import java.util.Scanner;

public class Main {
    static void Ex3()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println(sum + " " + (float)sum / n);
    }
    static void Ex4()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int mx = 0, mn = 100000;
        int k = 0;
        while (k < n)
        {
            if (arr[k] > mx) mx = arr[k];

            if (arr[k] < mn) mn = arr[k];
            k++;
        }
        System.out.println("max = " + mx + "\nmin = " + mn);
    }
    public static void main(String[] args) {
        Ex4();
    }
}