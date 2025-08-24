import java.util.*;

public class MatrixOperations2 {
    static double[][] randMatrix(int r,int c){
        double[][] m=new double[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    static double[][] transpose(double[][] A){
        int r=A.length, c=A[0].length;
        double[][] T=new double[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) T[j][i]=A[i][j];
        return T;
    }
    static double det2(double[][] a){
        return a[0][0]*a[1][1]-a[0][1]*a[1][0];
    }
    static double det3(double[][] a){
        double s=0;
        s += a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]);
        s -= a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0]);
        s += a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
        return s;
    }
    static double[][] inv2(double[][] a){
        double d=det2(a);
        if(Math.abs(d)<1e-9) return null;
        double[][] i=new double[2][2];
        i[0][0]= a[1][1]/d; i[0][1]= -a[0][1]/d;
        i[1][0]= -a[1][0]/d; i[1][1]= a[0][0]/d;
        return i;
    }
    static double[][] inv3(double[][] a){
        double d=det3(a);
        if(Math.abs(d)<1e-9) return null;
        double[][] c=new double[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                double[][] m=new double[2][2];
                int r=0;
                for(int r1=0;r1<3;r1++){
                    if(r1==i) continue;
                    int col=0;
                    for(int c1=0;c1<3;c1++){
                        if(c1==j) continue;
                        m[r][col++]=a[r1][c1];
                    }
                    r++;
                }
                double minor = det2(m);
                c[i][j] = ((i+j)%2==0? 1:-1)*minor;
            }
        double[][] adj=transpose(c);
        double[][] inv=new double[3][3];
        for(int i=0;i<3;i++) for(int j=0;j<3;j++) inv[i][j]=adj[i][j]/d;
        return inv;
    }
    static void print(double[][] M){
        for(double[] row: M){
            for(double v: row) System.out.printf("%8.3f", v);
            System.out.println();
        }
    }
    public static void main(String[] args){
        // Transpose demo
        double[][] A = randMatrix(3,4);
        System.out.println("A:"); print(A);
        System.out.println("Transpose(A):"); print(transpose(A));

        // Determinant & inverse 2x2
        double[][] B = randMatrix(2,2);
        System.out.println("B (2x2):"); print(B);
        System.out.printf("det(B)=%.3f%n", det2(B));
        double[][] Binv = inv2(B);
        System.out.println("inv(B): " + (Binv==null? "Not invertible": ""));
        if(Binv!=null) print(Binv);

        // Determinant & inverse 3x3
        double[][] C = randMatrix(3,3);
        System.out.println("C (3x3):"); print(C);
        System.out.printf("det(C)=%.3f%n", det3(C));
        double[][] Cinv = inv3(C);
        System.out.println("inv(C): " + (Cinv==null? "Not invertible": ""));
        if(Cinv!=null) print(Cinv);
    }
}
