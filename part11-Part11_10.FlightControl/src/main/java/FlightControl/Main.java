package FlightControl;
import flightControl.ui.TextUI;
import flightControl.logic.FlightControl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl flightControl = new FlightControl();
        Scanner scan = new Scanner(System.in);
        
        TextUI ui = new TextUI(flightControl, scan);
        ui.start();
    }
}
