import java.util.*;

class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand=new Random();
        int[] ages=new int[n];
        for(int i=0;i<n;i++) ages[i]=rand.nextInt(90)+10;
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] res=new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            res[i][0]=String.valueOf(ages[i]);
            res[i][1]=(ages[i]>=18)?"Can Vote":"Cannot Vote";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ages=generateAges(10);
        String[][] table=checkEligibility(ages);

        System.out.println("Age\tEligibility");
        for(String[] row:table) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
}
