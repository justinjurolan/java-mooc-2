
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Input numbers, type " + "end" + " to stop.");
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        
                
        System.out.println("Print the average of the negative numbers or the "
                + "positive number? (n/p)");
        
        String choice = scanner.nextLine();
        
        if (choice.equals("p")) {
            double averageOfPositiveNum = list.stream().
                mapToInt(l -> Integer.valueOf(l)).
                filter(num -> num > 0).
                average().
                getAsDouble();
            System.out.println("Average of the positive numbers: " + averageOfPositiveNum);
        }
        
        if (choice.equals("n")) {
            double averageOfNegativeNum = list.stream().
                mapToInt(l -> Integer.valueOf(l)).
                filter(num -> num < 0).
                average().
                getAsDouble();
            System.out.println("Average of the negative numbers: " + averageOfNegativeNum);
        }

    }
}
