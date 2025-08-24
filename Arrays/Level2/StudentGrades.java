import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks: [student][3 subjects]
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    System.out.print("Subject " + (j + 1) + ": ");
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("❌ Invalid! Marks should be between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);  // validate
                marks[i][j] = mark;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Assign grade
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 75) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " => Physics: " + marks[i][0] +
                               ", Chemistry: " + marks[i][1] +
                               ", Maths: " + marks[i][2] +
                               ", Percentage: " + percentages[i] + "%" +
                               ", Grade: " + grades[i]);
        }

        sc.close();
    }
}
