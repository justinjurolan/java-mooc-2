
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stop: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            String age = scanner.nextLine();
            books.add(new Books(bookName, Integer.valueOf(age)));
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        
        Comparator<Books> comparator = Comparator.
                comparing(Books::getBookRecommendedAge).
                thenComparing(Books::getBookName);  
        
        Collections.sort(books,comparator);
        
        for (Books b : books) {
            System.out.println(b);
        }
        
    }

}
