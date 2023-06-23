
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        String num = scanner.nextLine();
        printRandomNumber(Integer.valueOf(num));
    }
    
    public static void printRandomNumber(int howMany) {
        Random random = new Random();
        int i = 0;
        while (i < howMany) {
            System.out.println(random.nextInt(11));
            i++;
        }
    }

}
