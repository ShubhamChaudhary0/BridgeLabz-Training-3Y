import java.util.Scanner;

class StringLength {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int myLength = getLength(input);
        int builtIn = input.length();

        System.out.println("Length (custom): " + myLength);
        System.out.println("Length (built-in): " + builtIn);
    }
}
