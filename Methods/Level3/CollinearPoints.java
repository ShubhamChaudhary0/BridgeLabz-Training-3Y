import java.util.*;

public class CollinearPoints {
    static boolean collinearByArea(double x1,double y1,double x2,double y2,double x3,double y3){
        double area = 0.5 * ( x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2) );
        return Math.abs(area) < 1e-9;
    }
    static boolean collinearBySlope(double x1,double y1,double x2,double y2,double x3,double y3){
        // Handle verticals safely: (y2-y1)*(x3-x1) == (y3-y1)*(x2-x1)
        double lhs = (y2-y1)*(x3-x1);
        double rhs = (y3-y1)*(x2-x1);
        return Math.abs(lhs - rhs) < 1e-9;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 y1: "); double x1=sc.nextDouble(), y1=sc.nextDouble();
        System.out.print("Enter x2 y2: "); double x2=sc.nextDouble(), y2=sc.nextDouble();
        System.out.print("Enter x3 y3: "); double x3=sc.nextDouble(), y3=sc.nextDouble();
        System.out.println("Collinear (slope)? " + (collinearBySlope(x1,y1,x2,y2,x3,y3)?"Yes":"No"));
        System.out.println("Collinear (area)?  " + (collinearByArea(x1,y1,x2,y2,x3,y3)?"Yes":"No"));
    }
}
