import java.util.*;

public class NumberChecker5 {
    static int[] factorsProper(int n){
        int cnt=0; for(int i=1;i<=n/2;i++) if(n%i==0) cnt++;
        int[] f=new int[cnt]; int k=0;
        for(int i=1;i<=n/2;i++) if(n%i==0) f[k++]=i;
        return f;
    }
    static int sum(int[] a){ int s=0; for(int v:a) s+=v; return s; }
    static boolean isPerfect(int n){ return n>0 && sum(factorsProper(n))==n; }
    static boolean isAbundant(int n){ return n>0 && sum(factorsProper(n))>n; }
    static boolean isDeficient(int n){ return n>0 && sum(factorsProper(n))<n; }
    static long fact(int d){ long f=1; for(int i=2;i<=d;i++) f*=i; return f; }
    static boolean isStrong(int n){
        int t=Math.abs(n), sum=0;
        while(t>0){ sum+=fact(t%10); t/=10; }
        return sum==Math.abs(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        System.out.println("Perfect? " + (isPerfect(n)?"Yes":"No"));
        System.out.println("Abundant? " + (isAbundant(n)?"Yes":"No"));
        System.out.println("Deficient? " + (isDeficient(n)?"Yes":"No"));
        System.out.println("Strong? " + (isStrong(n)?"Yes":"No"));
    }
}
