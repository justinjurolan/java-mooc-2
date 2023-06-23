
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Person anna = new Person("Anna", Education.PHD);
        Employees employ = new Employees();
        employ.add(anna);
        
        employ.print(Education.PHD);
    }
}
