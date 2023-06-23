
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        // the method containsNumber is probably useful
        // Implement the random number generation here

        this.numbers = new ArrayList<>();
        Random random = new Random();
        
        while (this.numbers.size() < 7) {
            int lotteryNumber = random.nextInt(40) + 1;
            if (!this.containsNumber(lotteryNumber)) {
                this.numbers.add(lotteryNumber);
            }
        }
        
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers        
        return this.numbers.contains(number);
    }
}

