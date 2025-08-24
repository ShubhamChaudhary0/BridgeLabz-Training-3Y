import java.util.*;

public class NumberChecker2 {
    static int[] toDigits(long n){
        String s=String.valueOf(Math.abs(n));
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    static int sumDigits(int[] d){ int s=0; for(int v:d) s+=v; return s; }
    static int sumSquares(int[] d){ int s=0; for(int v:d) s+=v*v; return s; }
    static boolean isHarshad(long n){
        int[] d = toDigits(n);
        int sum = sumDigits(d);
        if(sum==0) return false;
        return Math.abs(n) % sum == 0;
    }
    static int[][] digitFreq(long n){
        int[] freq = new int[10];
        for(int v: toDigits(n)) freq[v]++;
        int[][] out = new int[10][2];
        for(int i=0;i<10;i++){ out[i][0]=i; out[i][1]=freq[i]; }
        return out;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n=sc.nextLong();
        int[] d=toDigits(n);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Sum of digits: " + sumDigits(d));
        System.out.println("Sum of squares: " + sumSquares(d));
        System.out.println("Harshad? " + (isHarshad(n)?"Yes":"No"));
        System.out.println("Digit frequencies [digit:freq]:");
        int[][] f = digitFreq(n);
        for(int[] row: f) System.out.println(row[0]+": "+row[1]);
    }
}
