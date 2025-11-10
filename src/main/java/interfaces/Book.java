package interfaces;

public class Book implements Product{
    private String name;
    private  String author;
    private String ISBN;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }
}
