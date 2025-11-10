package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] numbers = generateNumbers();
        printTicket(numbers);

    }

    public  static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i=0;i<LENGTH;i++){
            int randomNumber;
            do {
                randomNumber = random.nextInt(1,MAX_TICKET_NUMBER);
            }while (searchInNumbers(ticket,randomNumber));
             ticket[i] = randomNumber;

        }
    return ticket;
    }

    public static  boolean searchInNumbers(int[] numbers, int numberToSearchFor){
        for(int number: numbers){
            if (number==numberToSearchFor) return  true;
        }
        return  false;
    }

    public  static  void printTicket(int[] tickets){
        Arrays.sort(tickets);
        for(int value: tickets){
            System.out.print(value+" | ");
        }
    }

}
