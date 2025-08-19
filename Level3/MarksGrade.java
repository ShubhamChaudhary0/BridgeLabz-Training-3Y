import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks = " + average);

        if (average >= 90)
            System.out.println("Grade: A (Excellent)");
        else if (average >= 75)
            System.out.println("Grade: B (Good)");
        else if (average >= 50)
            System.out.println("Grade: C (Average)");
        else
            System.out.println("Grade: F (Fail)");

        sc.close();
    }
}
