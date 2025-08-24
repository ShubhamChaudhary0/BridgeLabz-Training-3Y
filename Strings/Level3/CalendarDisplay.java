import java.util.*;

class CalendarDisplay {
    public static String monthName(int m){
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return months[m-1];
    }
    public static int daysInMonth(int m,int y){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeap(y)) return 29;
        return days[m-1];
    }
    public static boolean isLeap(int y){
        if(y%400==0|| (y%4==0 && y%100!=0)) return true;
        return false;
    }
    public static int firstDay(int d,int m,int y){
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m=sc.nextInt();
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        System.out.println("   "+monthName(m)+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int d0=firstDay(1,m,y);
        for(int i=0;i<d0;i++) System.out.print("    ");
        int days=daysInMonth(m,y);
        for(int d=1;d<=days;d++){
            System.out.printf("%3d ",d);
            if(((d+d0)%7==0)) System.out.println();
        }
        System.out.println();
    }
}
