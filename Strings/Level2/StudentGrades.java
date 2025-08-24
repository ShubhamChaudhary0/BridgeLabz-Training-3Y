import java.util.*;

class StudentGrades {
    public static int[][] generateMarks(int n) {
        Random rand=new Random();
        int[][] marks=new int[n][3];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) marks[i][j]=rand.nextInt(41)+60; // 60-100
        }
        return marks;
    }

    public static String grade(double per) {
        if(per>=90) return "A";
        else if(per>=80) return "B";
        else if(per>=70) return "C";
        else if(per>=60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        int[][] marks=generateMarks(5);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for(int i=0;i<marks.length;i++) {
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double avg=total/3.0;
            double per=(total/300.0)*100;
            String g=grade(per);
            System.out.println(marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+total+"\t"+Math.round(avg*100.0)/100.0+"\t"+Math.round(per*100.0)/100.0+"\t"+g);
        }
    }
}
