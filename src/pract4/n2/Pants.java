package pract4.n2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: Размер " + getSize() + ", Цвет " + getColor() + ", Цена " + getPrice());

    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: Размер " + getSize() + ", Цвет " + getColor() + ", Цена " + getPrice());
    }

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }
}
