package pract2.Shop;

import java.util.Scanner;

public class TesterShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во компьютеров: ");

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            shop.addComputer(scanner.next());
        }
        System.out.println("Поиск: ");
        shop.searchComputer(scanner.next());
    }
}
