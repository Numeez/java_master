package methods;

public class Rectangle {
    protected int sides = 4;
    protected double length,width;

    public Rectangle(){
        setLength(0);
        setWidth(0);

    }

    public void print(){
        System.out.println("I am a rectangle");
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


    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }
    public double calculateArea(){
        return length*width;
    }
}
