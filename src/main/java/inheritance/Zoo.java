package inheritance;

public class Zoo {
    public static void main(String[] args) {
//        Animal dog  = new Dog();
        Animal cat = new Cat();
//        dog.makeSound();
        cat.makeSound();
        ((Cat)cat).scratch();
        feed(cat);

    }
    public  static void  feed(Animal animal){
            if (animal instanceof  Dog){
                System.out.println("Dog food");
            } else if (animal instanceof Cat) {
                System.out.println("Cat food");
            }
    }
}
