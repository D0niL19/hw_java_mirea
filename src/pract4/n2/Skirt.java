package pract4.n2;

public class Skirt extends Clothes implements WomenClothing{
    @Override
    public void dressWomen() {
        System.out.println("Женская юбка: Размер " + getSize() + ", Цвет " + getColor() + ", Цена " + getPrice());
    }

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }
}
