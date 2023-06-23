package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name should not be empty or over 40 characters in length");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be 0 to 120 years old");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
