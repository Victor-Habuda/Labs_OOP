package lab1;
import lab1.Matrix;

public class lab1 {
    public static void main (String[] args){


//        getVariant(); //c5 = 3, c7 = 0, c11 = 10

    }
    public static double[][] xor(double[][] matrixA ,double[][] matrixB) {
        double[][] c = new double[2][2];
//        System.out.println("Matrix A");
//        printMatrix(matrixA);
//        System.out.println("Matrix B");
//        printMatrix(matrixB);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                long a = Double.doubleToRawLongBits(matrixA[i][j]);
                long b = Double.doubleToRawLongBits(matrixB[i][j]);
                long res = a ^ b;
                c[i][j] = Double.longBitsToDouble(res);
            }
        }
        System.out.println("Matrix C");
//        printMatrix(c);
        return c;
    }


//    public static void printMatrix(double[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.print("[ ");
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.printf("%5.1f", matrix[i][j]);
//            }
//            System.out.println("]");
//        }
//    }


    public static void getVariant(){
        int id = 5103;
        int c5 = id % 5;
        int c7 = id % 7;
        int c11 = id % 11;
        System.out.println(c5);
        System.out.println(c7);
        System.out.println(c11);
    }
    Matrix matrixA = new Matrix((double) 1.0f, (double) 0.0f, (double) 1.0f, (double) 0.0f);
    Matrix matrixB = new Matrix((double) 2.0f, (double) 0.0f, (double) 3.0f, (double) 0.0f);
    Matrix matrixC = new Matrix(xor(matrixA.getMatrix(), matrixB.getMatrix()));
    
}
