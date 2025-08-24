import java.util.*;

public class MatrixOperations1 {
    static int[][] randMatrix(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    static int[][] add(int[][] A,int[][] B){
        int r=A.length,c=A[0].length;
        int[][] C=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) C[i][j]=A[i][j]+B[i][j];
        return C;
    }
    static int[][] sub(int[][] A,int[][] B){
        int r=A.length,c=A[0].length;
        int[][] C=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) C[i][j]=A[i][j]-B[i][j];
        return C;
    }
    static int[][] mul(int[][] A,int[][] B){
        int r=A.length, c=B[0].length, k=A[0].length;
        int[][] C=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                int s=0;
                for(int t=0;t<k;t++) s+=A[i][t]*B[t][j];
                C[i][j]=s;
            }
        return C;
    }
    static void print(int[][] M){
        for(int[] row: M){
            for(int v: row) System.out.printf("%4d", v);
            System.out.println();
        }
    }
    public static void main(String[] args){
        int r=2+(int)(Math.random()*3); // 2..4
        int c=2+(int)(Math.random()*3);
        int[][] A=randMatrix(r,c);
        int[][] B=randMatrix(r,c);
        System.out.println("A:"); print(A);
        System.out.println("B:"); print(B);
        System.out.println("A+B:"); print(add(A,B));
        System.out.println("A-B:"); print(sub(A,B));
        // For multiplication, ensure dims match
        int k=2+(int)(Math.random()*3);
        int[][] X=randMatrix(r,k);
        int[][] Y=randMatrix(k,c);
        System.out.println("X:"); print(X);
        System.out.println("Y:"); print(Y);
        System.out.println("X*Y:"); print(mul(X,Y));
    }
}
