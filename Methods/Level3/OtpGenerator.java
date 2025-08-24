import java.util.*;

public class OtpGenerator {
    static int generateOtp(){
        return 100000 + (int)(Math.random()*900000); // 6-digit
    }
    static boolean allUnique(int[] a){
        Set<Integer> s=new HashSet<>();
        for(int v:a){ if(!s.add(v)) return false; }
        return true;
    }
    static boolean allSame(int[] a){
        for(int i=1;i<a.length;i++) if(a[i]!=a[0]) return false;
        return true;
    }
    public static void main(String[] args){
        int[] otps=new int[10];
        for(int i=0;i<10;i++) otps[i]=generateOtp();
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("All unique? " + (allUnique(otps)?"Yes":"No"));
        System.out.println("All the same? " + (allSame(otps)?"Yes":"No (validation passed)"));
    }
}
