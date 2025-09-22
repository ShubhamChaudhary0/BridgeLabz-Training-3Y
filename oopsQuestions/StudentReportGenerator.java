import java.util.*;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double average() throws InvalidMarkException {
        int sum = 0;
        for (int m : marks) {
            if (m < 0 || m > 100) throw new InvalidMarkException("Invalid mark: " + m);
            sum += m;
        }
        return (double) sum / marks.length;
    }

    public String grade(double avg) {
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }

    public void display() {
        try {
            double avg = average();
            System.out.println(name + " | Avg: " + avg + " | Grade: " + grade(avg));
        } catch (InvalidMarkException e) {
            System.out.println("Error for " + name + ": " + e.getMessage());
        }
    }
}

public class StudentReportGenerator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Gaurav", new int[]{90, 85, 92}));
        students.add(new Student("Amit", new int[]{70, 65, 88}));
        students.add(new Student("Ravi", new int[]{50, 45, 60}));
        for (Student s : students) s.display();
    }
}
