import java.util.*;

class BMI {
    public static double calcBMI(double w, double h) {
        double hm = h / 100.0;
        return w / (hm * hm);
    }
    public static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            people[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i+1) + ": ");
            people[i][1] = sc.nextDouble();
        }
        System.out.printf("%-10s %-10s %-10s %-15s\n","Weight","Height","BMI","Status");
        for (int i = 0; i < 10; i++) {
            double bmi = calcBMI(people[i][0], people[i][1]);
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                people[i][0], people[i][1], bmi, status(bmi));
        }
    }
}
