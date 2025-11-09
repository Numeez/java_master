package methods;

import java.util.Scanner;

public class User {
public static void main (String[] args){
    String name  =  getUserName();
    greetUser(name);
}

public static  String getUserName(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name");
    String name  = scanner.next();
    scanner.close();
    return  name;
}





public static  void  greetUser(String name){
    System.out.println("Hello "+name);
}
}
