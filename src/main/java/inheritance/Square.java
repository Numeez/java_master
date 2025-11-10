package inheritance;

import methods.Rectangle;

public class Square  extends Rectangle {
    @Override
    public double calculatePerimeter() {
        return sides* length;
    }
    @Override
    public void print(){
        System.out.println("I am a square");
    }
    public void print(String what) {
        System.out.println("I am a: "+what);
    }
}
