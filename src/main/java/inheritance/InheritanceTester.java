package inheritance;

import methods.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(4);
        System.out.println(square.calculatePerimeter());
        Rectangle rectangle = new Rectangle();
        rectangle.print();
        square.print("Numeez");
    }
}
