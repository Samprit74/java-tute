import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Student {

    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("John", 1),
                new Student("Alice", 2),
                new Student("Bob", 3),
                new Student("David", 4)
        );

        // Predicate: even roll
        Predicate<Student> evenRoll = (s) -> {
            if (s.getRoll() % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        // Function: convert to final string with "Mr."
        Function<Student, String> transformStudent = (s) -> {

            String newName = "Mr. " + s.getName();
            int rollNumber = s.getRoll();

            String finalString = newName + " - " + rollNumber;

            return finalString;
        };

        // Comparator: descending order
        Comparator<String> descendingOrder = (a, b) -> {

            int result = b.compareTo(a);
            return result;
        };

        // Stream processing
        List<String> result = students.stream()
                .filter(evenRoll)
                .map(transformStudent)
                .sorted(descendingOrder)
                .collect(Collectors.toList());

        // Print result
        for (String s : result) {
            System.out.println(s);
        }
    }
}
