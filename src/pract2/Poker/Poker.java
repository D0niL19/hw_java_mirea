package pract2.Poker;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Deck deck = new Deck();
        deck.setCards();
        deck.shuffle();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 5; j++){
                System.out.print(deck.givecard() + "   ");
            }
            System.out.println("");
        }
    }
}
