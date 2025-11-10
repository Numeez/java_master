package inheritance;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("woff");
    }
    public void  fetch(){
        System.out.println("fetching........");
    }
}
