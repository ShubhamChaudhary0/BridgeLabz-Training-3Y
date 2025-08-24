import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or negative to stop):");

        while (true) {
            double input = sc.nextDouble();

            if (input <= 0 || index == 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Show results
        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nTotal sum = " + total);

        sc.close();
    }
}
