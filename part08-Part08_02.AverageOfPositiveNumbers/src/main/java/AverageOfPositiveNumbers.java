
import java.util.Scanner;
import java.util.ArrayList;


public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNum = new ArrayList<Integer>();
        
        while (true) {
            String scanVal = scanner.nextLine();
            int intVal = Integer.valueOf(scanVal);
            
            if (intVal == 0) {
                break;
            }
            
            if (intVal > 0) {
                positiveNum.add(intVal);
            }
            
        }
        int sum = 0;
        
        for (int p : positiveNum) {
            sum += p;
        }
        
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / positiveNum.size());
        }        
    }
}
