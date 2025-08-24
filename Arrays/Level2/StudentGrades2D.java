import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array for marks: rows = students, columns = 3 subjects (Physics, Chemistry, Maths)
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                
                int mark;
                do {
                    System.out.print(subject + " (0–100): ");
                    mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid input! Enter marks between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                
                marks[i][j] = mark;
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Determine grade
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "D";
            }
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        
        for (int i = 0; i < n; i++) {
            System.out.println(" " + (i + 1) + "\t" + 
                               marks[i][0] + "\t" + 
                               marks[i][1] + "\t\t" + 
                               marks[i][2] + "\t" + 
                               String.format("%.2f", percentage[i]) + "%\t" + 
                               grade[i]);
        }

        sc.close();
    }
}
