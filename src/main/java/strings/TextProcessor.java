package strings;

public class TextProcessor {
    public static void main(String[] args) {
        addSpaces("ILoveJava");
    }

    public static  void  countWords(String text){
        var words  = text.split(" ");
        var message = String.format("Your text contains %d",words.length);
        System.out.println(message);
        for(String word: words){
            System.out.println(word);
        }

    }
    public static void reverseString(String text){
        StringBuilder builder = new StringBuilder(text);
        builder.reverse();
        System.out.println(builder);

    }

    public  static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for(int i= 0;i<modifiedText.length();i++){
            if (i!=0&& Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);

    }
}
