package inheritance;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Mewwww");
    }
    public  void  scratch(){
        System.out.println("Scratching...... grrrr.......");
    }
}
