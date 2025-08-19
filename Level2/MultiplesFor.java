import java.util.Scanner;
public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("First 10 multiples of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.print((n * i) + " ");
        }
        sc.close();
    }
}
