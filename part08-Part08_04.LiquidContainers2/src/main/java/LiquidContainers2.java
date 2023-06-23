
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
           String[] parts = input.split(" ");
           String commands = parts[0];
           int integerVal = Integer.valueOf(parts[1]);
           
           if (commands.equals("add")) {
               firstContainer.add(integerVal);
           }
           
           if (commands.equals("move")) {
               secondContainer.move(firstContainer, integerVal);
           }
           
           if (commands.equals("remove")) {
               secondContainer.remove(integerVal);
           }

        }
    }

}
