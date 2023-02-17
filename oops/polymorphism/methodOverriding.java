package oops.polymorphism;

public class methodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats food");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
