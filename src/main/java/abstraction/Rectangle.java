package abstraction;

public class Rectangle extends Shape{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private  double width;
    Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea() {
        return 0;
    }
}
