package oops.inheritance;

public class multiLVLinheritance {
    public static void main(String[] args) {
        Dog jimmy = new Dog();
        jimmy.eat();
        jimmy.legs = 4;
        System.out.println(jimmy.legs);

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

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}
