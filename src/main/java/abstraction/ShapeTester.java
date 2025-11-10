package abstraction;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(30,40);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
