import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Step 2: Create arrays
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step 3: Take input for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            System.out.print("Weight (in kg): ");
            weights[i] = sc.nextDouble();

            System.out.print("Height (in meters): ");
            heights[i] = sc.nextDouble();

            // Step 4: Calculate BMI
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Step 5: Determine weight status
            if (bmi[i] < 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    (i + 1), heights[i], weights[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
