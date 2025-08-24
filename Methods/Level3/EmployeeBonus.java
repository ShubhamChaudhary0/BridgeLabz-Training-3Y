import java.util.*;

public class EmployeeBonus {
    static double[][] generateSalaryAndService(int n){
        double[][] a = new double[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = 10000 + (int)(Math.random()*90000); // 5-digit
            a[i][1] = (int)(Math.random()*16); // 0..15 years
        }
        return a;
    }
    static double[][] newSalaryAndBonus(double[][] base){
        int n=base.length;
        double[][] out=new double[n][2]; // [newSalary, bonus]
        for(int i=0;i<n;i++){
            double sal=base[i][0];
            int yrs=(int)base[i][1];
            double rate = yrs>5 ? 0.05 : 0.02;
            double bonus = sal*rate;
            out[i][0] = sal + bonus;
            out[i][1] = bonus;
        }
        return out;
    }
    public static void main(String[] args){
        int n=10;
        double[][] base = generateSalaryAndService(n);
        double[][] upd  = newSalaryAndBonus(base);
        double sumOld=0, sumNew=0, totalBonus=0;
        System.out.printf("%-4s %-10s %-6s %-12s %-12s%n","ID","OldSal","Yrs","NewSal","Bonus");
        for(int i=0;i<n;i++){
            sumOld += base[i][0];
            sumNew += upd[i][0];
            totalBonus += upd[i][1];
            System.out.printf("%-4d %-10.0f %-6.0f %-12.0f %-12.0f%n", i+1, base[i][0], base[i][1], upd[i][0], upd[i][1]);
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("Sum Old: %.0f | Sum New: %.0f | Total Bonus: %.0f%n", sumOld, sumNew, totalBonus);
    }
}
