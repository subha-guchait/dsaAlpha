package oops.inheritance;

public class hybridinheritance {
    public static void main(String[] args) {

    }
}

class Animal {

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

class tuna extends Fish {
    void live() {
        System.out.println("lives in sea");
    }
}

class Shark extends Fish {
    void live() {
        System.out.println("lives in deep sea");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly in the sky");
    }
}

class peacock extends Bird {
    void dance() {
        System.out.println("they dance in rany day");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    void sound() {
        System.out.println("ghew");
    }
}

class Cat extends Mammal {
    void sound() {
        System.out.println("meow");
    }
}

class Human extends Mammal {
    void intelegent() {
        System.out.println("they are intelegent");
    }
}