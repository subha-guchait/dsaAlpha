package oops.polymorphism;

public class methodoverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 5));
        System.out.println(calc.sum((float) 1.9, (float) 5.6));
        System.out.println(calc.sum(1, 5, 9));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
