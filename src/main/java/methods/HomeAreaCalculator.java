package methods;

import java.util.Scanner;

public class HomeAreaCalculator {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculator calculator = new HomeAreaCalculator();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();
        calculator.scanner.close();
        System.out.println("Total area: "+calculator.calculateAreaOfRoom(room1,room2));

    }
      public   Rectangle getRoom(){
        System.out.println("Enter lenght of room");
        double length = scanner.nextDouble();
        System.out.println("Enter width of room");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);
    }
       public    double calculateAreaOfRoom(Rectangle room1 ,Rectangle room2){
        return room1.calculateArea()+room2.calculateArea();
    }
}
