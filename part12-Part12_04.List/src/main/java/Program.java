
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        myList.add("MAMA");
        myList.add("PAPA");
        int index  = myList.findIndexValue("MAMA");
        System.out.println(myList.get(index));
        System.out.println(myList.get(1));
        
    }

}
