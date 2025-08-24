import java.util.*;

public class CalendarPrinter {
    static boolean isLeap(int y){
        return (y%4==0 && y%100!=0) || (y%400==0);
    }
    static String monthName(int m){
        String[] names={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        return (m>=1 && m<=12)? names[m] : "Invalid";
    }
    static int daysInMonth(int m,int y){
        int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeap(y)) return 29;
        return days[m];
    }
    // Sakamoto's algorithm (0=Sunday..6=Saturday) for first day
    static int firstDayOfMonth(int y, int m){
        int[] t = {0,3,2,5,0,3,5,1,4,6,2,4};
        if(m<3) y-=1;
        return (y + y/4 - y/100 + y/400 + t[m-1] + 1) % 7;
    }
    static void printCalendar(int m,int y){
        System.out.printf("%s %d%n", monthName(m), y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int fd = firstDayOfMonth(y,m);
        int dim = daysInMonth(m,y);
        for(int i=0;i<fd;i++) System.out.print("    ");
        int day=1, w=fd;
        while(day<=dim){
            System.out.printf("%3d ", day);
            w=(w+1)%7;
            if(w==0) System.out.println();
            day++;
        }
        if(w!=0) System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m=sc.nextInt();
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        printCalendar(m,y);
    }
}
