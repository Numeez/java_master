package methods;

public class Rectangle {
    private int sides = 4;
    private double length,width;

    public Rectangle(){
        setLength(0);
        setWidth(0);

    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);

    }

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


    double calculatePerimeter(){
        return (2*length)+(2*width);
    }
    double calculateArea(){
        return length*width;
    }
}
