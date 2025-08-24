import java.util.*;

public class StudentScores {
    static int[][] generatePCM(int n){
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j] = 10 + (int)(Math.random()*90); // 10..99
            }
        }
        return a;
    }
    static double round2(double v){ return Math.round(v*100.0)/100.0; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] pcm=generatePCM(n);
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAverage\tPercent");
        for(int i=0;i<n;i++){
            int total = pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg = round2(total/3.0);
            double pct = round2((total/300.0)*100.0);
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%.2f%n",
                i+1, pcm[i][0], pcm[i][1], pcm[i][2], total, avg, pct);
        }
    }
}
