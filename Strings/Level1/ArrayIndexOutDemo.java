import java.util.Scanner;

public class ArrayIndexOutDemo {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
        }

        // generateException(names);
        handleException(names);
    }
}
