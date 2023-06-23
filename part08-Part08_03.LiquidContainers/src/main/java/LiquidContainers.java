
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String commands = parts[0];
            int val = Integer.valueOf(parts[1]);
            
            if (commands.equals("add")) {
                
                if (containerOne + val >= 100) {
                    containerOne = 100;
                }
                
                if (val > 0 && containerOne + val <= 100) {
                    containerOne += val;
                }
            }
            
            if (commands.equals("move")) {
                
                if (containerTwo + val >= 100) {
                    containerTwo = 100;
                    containerOne = 0;
                }
                
                if (val > 0 && val >= containerOne) {
                    containerTwo += containerOne;
                    containerOne = 0;
                }
                
                if (val > 0 && val <= containerOne) {
                    containerTwo += val;
                    containerOne -= val;
                }
                
            }
            
            if (commands.equals("remove")) {
                 
                if (val > 0 && val > containerTwo) {
                    containerTwo = 0;
                }
                
                if (val > 0 && val <= containerTwo) {
                    containerTwo -= val;
                }
               
            }
        }
    }

}
