package pract2.Poker;

public class Card {
    String number, symbol;

    public Card(String number, String symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public String showCard(){
        return number + " " + symbol;
    }
}
