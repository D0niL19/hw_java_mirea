package pract4.n2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: Размер " + getSize() + ", Цвет " + getColor() + ", Цена " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: Размер " + getSize() + ", Цвет " + getColor() + ", Цена " + getPrice());
    }
}
