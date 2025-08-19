public class DayOfWeek {
    public static void main(String[] args) {
        // Step 1: Read inputs from command line
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Step 2: Apply formula
        int Y0 = y - (14 - m) / 12;
        int x = Y0 + Y0 / 4 - Y0 / 100 + Y0 / 400;
        int M0 = m + 12 * ((14 - m) / 12) - 2;
        int D0 = (d + x + (31 * M0) / 12) % 7;

        // Step 3: Print result
        System.out.println(D0);
    }
}
