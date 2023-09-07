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
    static void Ex5()
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++)
        {
            System.out.println(scanner.next());
        }
    }
    static void Ex6()
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.printf("%.2f\n", 1f / i);
        }
    }
    static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }
    static void Ex7()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), ans = 1;
        for (int i = 1; i <= n; i++)
        {
            ans *= i;
        }

        System.out.println(ans);
        //System.out.println(fact(n));
    }

    public static void main(String[] args) {
        Ex7();
    }
}