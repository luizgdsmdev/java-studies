package exercises.OOP.exerc_2.books;

public class Books {
    public String title;
    private String author;
    private double price;

    // public Books(String title, String author, double price){
    //     this.title = title;
    //     this.author = author;
    //     this.price = price;
    // };

    public String getTitle(){
        return this.title;
    };

    public void setTitle(String newTitle){
        this.title = newTitle;
    };

    public String getAuthor(){
        return this.author;
    };

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    };

    public double getPrice(){
        return this.price;
    };

    public void setPrice(double newPrice){
        this.price = newPrice;
    };
}


