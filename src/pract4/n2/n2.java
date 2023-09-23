package pract4.n2;

public class n2 {
    public static void main(String[] args){
        TShirt tShirt1 = new TShirt(Size.M, 25, "Красный");
        TShirt tShirt2 = new TShirt(Size.XXS, 19, "Синий");
        Pants pants1 = new Pants(Size.L, 49, "Черный");
        Pants pants2 = new Pants(Size.S, 39, "Серый");
        Skirt skirt = new Skirt(Size.S, 29, "Зеленый");
        Tie tie = new Tie(Size.M, 14, "Синий");

        Clothes[] allClothes = {tShirt1, tShirt2, pants1, pants2, skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressWomen(allClothes);
        atelier.dressMan(allClothes);
    }
}
