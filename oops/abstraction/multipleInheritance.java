package oops.abstraction;

public class multipleInheritance {
    public static void main(String[] args) {
        Bear B = new Bear();
        B.grass();
        B.meat();
    }
}

interface Herbivore {
    void grass();
}

interface Carnivore {
    void meat();
}

class Bear implements Herbivore, Carnivore {
    public void grass() {
        System.out.println("eats grass");
    }

    public void meat() {
        System.out.println("eats meat");
    }
}
