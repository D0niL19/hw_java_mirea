import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split("\\s+");
        System.out.println(strings.length);

    }
}
