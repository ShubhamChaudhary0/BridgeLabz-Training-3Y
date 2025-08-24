import java.util.*;

public class NumberChecker4 {
    static boolean isPrime(long n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0||n%3==0) return false;
        for(long i=5;i*i<=n;i+=6) if(n%i==0||n%(i+2)==0) return false;
        return true;
    }
    static boolean isNeon(long n){
        long sq=n*n, sum=0;
        while(sq>0){ sum+=sq%10; sq/=10; }
        return sum==n;
    }
    static boolean isSpy(long n){
        n=Math.abs(n);
        if(n==0) return false;
        long sum=0, prod=1;
        while(n>0){ long d=n%10; sum+=d; prod*=d; n/=10; }
        return sum==prod;
    }
    static boolean isAutomorphic(long n){
        long sq=n*n;
        return String.valueOf(sq).endsWith(String.valueOf(Math.abs(n)));
    }
    static boolean isBuzz(long n){
        return n%7==0 || Math.abs(n)%10==7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n=sc.nextLong();
        System.out.println("Prime? " + (isPrime(n)?"Yes":"No"));
        System.out.println("Neon? " + (isNeon(n)?"Yes":"No"));
        System.out.println("Spy? " + (isSpy(n)?"Yes":"No"));
        System.out.println("Automorphic? " + (isAutomorphic(n)?"Yes":"No"));
        System.out.println("Buzz? " + (isBuzz(n)?"Yes":"No"));
    }
}
