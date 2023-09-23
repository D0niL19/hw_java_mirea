package pract2.Dog;

import java.util.ArrayList;

public class DogHouse {
    ArrayList<Dog> dogs = new ArrayList<>();

    public void addDog(ArrayList<Dog> dog){
        this.dogs.addAll(dog);
    }

    @Override
    public String toString() {
        return "pract1.Dog.DogHouse{" +
                "dogs=" + dogs +
                '}';
    }
}
