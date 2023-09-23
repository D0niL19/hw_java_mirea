package pract2.Dog;

import java.util.ArrayList;

public class TesterDog {
    public static void main(String[] args) {

        DogHouse dogHouse = new DogHouse();
        Dog dog1 = new Dog("aa", 5);
        Dog dog2 = new Dog("bb", 435);
        Dog dog3 = new Dog("cc", 523);
        ArrayList<Dog> dogs = new ArrayList<Dog>() {
            {
                add(dog1);
                add(dog2);
                add(dog3);
            }
        };
        dogHouse.addDog(dogs);
        System.out.println(dogHouse.toString());
    }
}
