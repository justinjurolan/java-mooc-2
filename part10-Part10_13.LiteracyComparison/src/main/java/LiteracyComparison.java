
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> ratings = readCSV("literacy.csv");
        Collections.sort(ratings);
        ratings.forEach(row -> System.out.println(row));
        
    }
    
    public static ArrayList<Literacy> readCSV(String fileName) {
        ArrayList<Literacy> ratings = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(fileName)).
                    map(row -> row.split(",")).filter(parts -> parts.length >= 6).
                    map(parts -> new Literacy(parts[2].replace("(%)", "").trim(), parts[3], parts[4], Double.valueOf(parts[5]))).
                    forEach(rating -> ratings.add(rating));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return ratings;
    }
}
