
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tacos = new TripleTacoBox();
        
        System.out.println(tacos.tacosRemaining());
        int i = 0;
        while (i < 4) {
            tacos.eat();
            i++;
        }
        System.out.println(tacos.tacosRemaining());
        
    }
}
