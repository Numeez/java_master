package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static  int requiredSalary = 25000;
    static  int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore  = getCreditScore();
        scanner.close();
        boolean creditCheck = creditCheck(salary,creditScore);
        notify(creditCheck);

    }

    public static void notify(boolean creditCheck){
        if (creditCheck){
            System.out.println("Congrats you have been approved");
        }else{
            System.out.println("Sorry you didn't make it");
        }

    }
    public static double getSalary(){
        System.out.println("Enter your salary");
        return scanner.nextDouble();
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        return scanner.nextInt();

    }

    public  static boolean  creditCheck(double salary, int creditScore){
        return (salary >= requiredSalary && creditScore >= requiredCreditScore);
    }

}
