package oops.inheritance;

public class singleLVLinheritnances {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// derived class or subclass
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
