package oops.inheritance;

public class hierarchialinheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
        Bird parrot = new Bird();
        parrot.breathe();
        parrot.fly();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {

    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("fly in the sky");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("Walks");
    }
}
