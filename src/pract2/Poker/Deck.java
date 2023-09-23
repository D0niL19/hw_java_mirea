package pract2.Poker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    int size = 51;

    public void setCards() {
        String[] number = new String[13], symbol = new String[]{"♣", "♠", "♥", "♦"};
        for (int i = 2; i < 11; i++){
            number[i - 2] = i + "";
        }
        number[9] = "Jack";
        number[10] = "Queen";
        number[11] = "King";
        number[12] = "Ace";

        for (String num : number){
            for (String s : symbol){
                Card card = new Card(num, s);
                cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public String givecard(){
        Card card = cards.get(size);
        size -= 1;
        return card.showCard();
    }
}
