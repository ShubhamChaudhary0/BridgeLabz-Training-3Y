public class MathUtility {
    public static long factorial(int n) {
        if (n<0) return -1;
        long f=1;
        for (int i=1;i<=n;i++) f*=i;
        return f;
    }

    public static boolean isPrime(int n) {
        if (n<=1) return false;
        for (int i=2;i<=Math.sqrt(n);i++) if (n%i==0) return false;
        return true;
    }

    public static int gcd(int a,int b) {
        while (b!=0) {
            int t=b; b=a%b; a=t;
        }
        return a;
    }

    public static int fib(int n) {
        if (n<=0) return 0; if (n==1) return 1;
        int a=0,b=1,c=0;
        for (int i=2;i<=n;i++){ c=a+b;a=b;b=c; }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Factorial(5): "+factorial(5));
        System.out.println("IsPrime(11): "+isPrime(11));
        System.out.println("GCD(24,36): "+gcd(24,36));
        System.out.println("Fib(7): "+fib(7));
    }
}
