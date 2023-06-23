
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputVal = scanner.nextLine();
            
            if (inputVal.equals("end")) {
                break;
            }
            
            int convertedInputVal = Integer.valueOf(inputVal);
            System.out.println(convertedInputVal * convertedInputVal * convertedInputVal);
        }
    }
}
