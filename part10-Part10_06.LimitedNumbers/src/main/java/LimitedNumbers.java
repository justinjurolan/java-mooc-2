
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            str.add(input);
        }
        
        str.stream().
                mapToInt(i -> Integer.valueOf(i)).
                filter(i -> i >= 0 && i <= 5).
                forEach(i -> System.out.println(i));
        
    }
}
