package data_structures;

import java.util.HashSet;
import java.util.Set;


public class CollectionDemo {
    public static void main(String[] args) {
        setDemo();
    }

    public  static  void  setDemo(){
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        System.out.println(fruits);
        Set<String> moreFruit = Set.of("pear","cherry","raisins");
        System.out.println(moreFruit);
    }
}
