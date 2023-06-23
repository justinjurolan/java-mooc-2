

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item comb = new Item("Comb", 5);
        Item CD = new Item("CD", 5);
        Item candy = new Item("Candy", 2);
        
        Suitcase suitcase1 = new Suitcase(10);
        suitcase1.addItem(comb);
        suitcase1.addItem(candy);
        System.out.println(suitcase1.totalWeight());
        suitcase1.printItems();
        
        Hold one = new Hold(10);
        one.addSuitcase(suitcase1);
        System.out.println(one.totalWeight());
        one.printItems();
    }

}
