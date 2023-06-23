import java.util.ArrayList;
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        
        
          
          
    }
    
    public static ArrayList<Integer> sumOfDiagonals(int[][] array) {
        ArrayList<Integer> listOfSum = new ArrayList<>();
        int sum = 0;
        
        // from left to right
        for (int row = 0; row < array.length; row++) {
            for (int column = row; column <= row; column++) {
                int values = array[row][column];
                sum += values;
            }
        }
        
        listOfSum.add(sum);
        sum = 0;
        
        // from right to left
        for (int row = 0; row < array.length; row++) {
            for (int column = (array.length - 1) - row; column == (array.length - 1) - row; column--) {
                int values = array[row][column];
                sum += values;
            }
        }
        
        listOfSum.add(sum);
        sum = 0;
        
        return listOfSum;
    }
}
