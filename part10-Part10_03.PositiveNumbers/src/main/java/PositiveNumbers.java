
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-2);
        list.add(1);
        list.add(2);
        System.out.println(positive(list));

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveNum = numbers.stream().filter(num -> {
        return num > 0;
        }).collect(Collectors.toList());
        return positiveNum;
    }

}
