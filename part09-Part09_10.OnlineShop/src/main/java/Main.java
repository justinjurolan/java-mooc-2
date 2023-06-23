
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Test your app here
      Warehouse warehouse = new Warehouse();
    warehouse.addProduct("coffee", 5, 5);
    warehouse.addProduct("milk", 3, 3);
    warehouse.addProduct("mouse", 1,1);
 
        System.out.println(warehouse.stock("coffee"));
    

        
    }
}
