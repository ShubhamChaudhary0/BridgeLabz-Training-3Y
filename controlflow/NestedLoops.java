package Controlflow;

public class NestedLoops {
    public static void main(String[] args) {
        // Nested for loop
        System.out.println("Nested for loop:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Nested while loop
        System.out.println("\nNested while loop:");
        int k = 1;
        while (k <= 3) {
            int l = 1;
            while (l <= 2) {
                System.out.println("k = " + k + ", l = " + l);
                l++;
            }
            k++;
        }

        // Nested do-while loop
        System.out.println("\nNested do-while loop:");
        int m = 1;
        do {
            int n = 1;
            do {
                System.out.println("m = " + m + ", n = " + n);
                n++;
            } while (n <= 2);
            m++;
        } while (m <= 3);
    }
}
