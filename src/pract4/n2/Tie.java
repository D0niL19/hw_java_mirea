package pract4.n2;

public class Tie extends Clothes implements MenClothing{
    @Override
    public void dressMan() {
        System.out.println("Мужской галстук: Размер " + getSize() + ", Цвет " + getColor() + ", Цена " + getPrice());
    }

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }
}
