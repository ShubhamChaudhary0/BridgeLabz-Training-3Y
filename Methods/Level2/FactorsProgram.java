import java.util.Scanner;

public class FactorsProgram {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    public static int productFactors(int[] arr) {
        int prod = 1;
        for (int f : arr) prod *= f;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Product = " + productFactors(factors));
        System.out.println("Sum of squares = " + sumOfSquares(factors));
    }
}
