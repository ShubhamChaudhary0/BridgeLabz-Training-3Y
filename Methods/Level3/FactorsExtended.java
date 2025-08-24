import java.util.*;

public class FactorsExtended {
    static int[] factors(int n){
        int c=0; for(int i=1;i<=n;i++) if(n%i==0) c++;
        int[] a=new int[c]; int k=0;
        for(int i=1;i<=n;i++) if(n%i==0) a[k++]=i;
        return a;
    }
    static int greatestFactor(int[] f){ int max=f[0]; for(int v:f) if(v>max) max=v; return max; }
    static long sum(int[] f){ long s=0; for(int v:f) s+=v; return s; }
    static long product(int[] f){ long p=1; for(int v:f) p*=v; return p; }
    static double productCubes(int[] f){ double p=1.0; for(int v:f) p*=Math.pow(v,3); return p; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int[] f=factors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest factor: " + greatestFactor(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of cubes: " + productCubes(f));
    }
}
