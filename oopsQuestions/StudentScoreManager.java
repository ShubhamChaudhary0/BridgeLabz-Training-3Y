import java.util.*;

public class StudentScoreManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        int sum=0, max=-1, min=101;

        for (int i=0;i<n;i++) {
            System.out.print("Enter score for student "+(i+1)+": ");
            int s = sc.nextInt();
            if (s<0 || s>100) { System.out.println("Invalid!"); i--; continue; }
            scores[i]=s; sum+=s;
            if (s>max) max=s; if (s<min) min=s;
        }

        double avg = (double) sum/n;
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + max + ", Lowest: " + min);
        System.out.print("Above Average: ");
        for (int s: scores) if (s>avg) System.out.print(s+" ");
    }
}
