package lab1;


public class lab1 {
    public static void main (){

        xor((double) 12.0, (double) 14.0, (double) 16.0, (double) 18.0, (double) 0.0, (double) 0.0,
                (double) 0.0, (double) 0.0 );
//        getVariant(); //c5 = 3, c7 = 0, c11 = 10

    }
    public static double[][] xor(double a11, double a12, double a21, double a22, double b11, double b12,
                                 double b21, double b22) {

        double[][] matrixA = new double[][]{{a11, a12}, {a21, a22}};
        double[][] matrixB = new double[][]{{b11, b12}, {b21, b22}};

        double[][] c = new double[2][2];

        System.out.println("Matrix A");
        printMatrix(matrixA);
        System.out.println("Matrix B");
        printMatrix(matrixB);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                long a = Double.doubleToRawLongBits(matrixA[i][j]);
                long b = Double.doubleToRawLongBits(matrixB[i][j]);
                long res = a ^ b;
                c[i][j] = Double.longBitsToDouble(res);
            }
        }
        System.out.println("Matrix C");
        printMatrix(c);
        return c;
    }


    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5.1f", matrix[i][j]);
            }
            System.out.println("]");
        }
    }


    public static void getVariant(){
        int id = 5103;
        int c5 = id % 5;
        int c7 = id % 7;
        int c11 = id % 11;
        System.out.println(c5);
        System.out.println(c7);
        System.out.println(c11);
    }

}
