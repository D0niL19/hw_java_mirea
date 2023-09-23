package pract2.Dog;

public class Dog {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "pract1.Dog.pract1.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int toPerson(){
        return this.age * 7;
    }
}
