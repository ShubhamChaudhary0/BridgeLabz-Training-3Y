import java.util.*;

public class FootballTeamHeights {
    static int[] randomHeights() {
        int[] h = new int[11];
        for (int i = 0; i < 11; i++) h[i] = 150 + (int)(Math.random()*101); // 150..250
        return h;
    }
    static int sum(int[] a){ int s=0; for(int v:a) s+=v; return s; }
    static double mean(int[] a){ return a.length==0?0.0: (sum(a)*1.0)/a.length; }
    static int min(int[] a){ int m=a[0]; for(int v:a) if(v<m) m=v; return m; }
    static int max(int[] a){ int m=a[0]; for(int v:a) if(v>m) m=v; return m; }

    public static void main(String[] args){
        int[] h = randomHeights();
        System.out.println("Heights (cm): " + Arrays.toString(h));
        System.out.println("Shortest: " + min(h) + " cm");
        System.out.println("Tallest : " + max(h) + " cm");
        System.out.printf ("Mean    : %.2f cm%n", mean(h));
    }
}
