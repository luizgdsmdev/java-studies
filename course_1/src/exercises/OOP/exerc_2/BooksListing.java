package exercises.OOP.exerc_2;
import exercises.OOP.exerc_2.books.Books;

public class BooksListing {

    public static void main(String[] args){
        //Books book = new Books("Lord Of The Rings", "Tolkien", 169.70);
        Books book = new Books();

        book.setTitle("Lord Of The Rings");
        System.out.println(book.getTitle());


        book.setPrice(230D);
        System.out.println(book.getPrice());
        
        
        book.setAuthor("Tolkien");
        System.out.println(book.getAuthor());
    }
    
}
