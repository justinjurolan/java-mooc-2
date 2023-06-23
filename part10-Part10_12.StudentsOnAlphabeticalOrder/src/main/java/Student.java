

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student students) {
        if (this.getName().equals(students.getName())) {
            return 0;
        } else if (this.getName().compareTo(students.getName()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
