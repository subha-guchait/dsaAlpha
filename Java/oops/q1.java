// Create a class named 'Shape' with a method to printShape "This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangle" and "This is circle" respectively. Create a child class 'Square' of 'rectangle' having a method to printSquare "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

package oops;

public class q1 {
    public static void main(String[] args) {
        Square x = new Square();
        x.printSquare();
        x.printShape();
        x.print();
        Circle y = new Circle();
        y.print();
        y.printShape();

    }
}

class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void print() {
        System.out.println("This is rectangle");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is rectangle");
    }

}

class Circle extends Shape {
    void print() {
        System.out.println("This is circle");
    }
}
