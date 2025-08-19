import java.util.Scanner;
public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("First 10 multiples of " + n + ":");
        while (i <= 10) {
            System.out.print((n * i) + " ");
            i++;
        }
        sc.close();
    }
}
