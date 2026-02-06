package lab1;


public class lab1 {
    public static void main (){
//        getVariant(); //c5 = 3, c7 = 0, c11 = 10

//        double[][] matrixA = new double[][]{{0.0, 25.0}, {42.0, 0.0}}; // Результат Matrix C: {{15.0, 0.0}, {42.0, 99.0}}
//        double[][] matrixB = new double[][]{{15.0, 25.0}, {0.0, 99.0}};
        double[][] matrixA = new double[][]{{12.0, 14.0}, {16.0, 18.0}};
        double[][] matrixB = new double[][]{{0.0, 0.0}, {0.0, 0.0}}; // Результат Matrix C: {{12.0, 14.0}, {16.0, 18.0}}


//        double[][] matrixA = new double[][]{{7.0, 0.0}, {0.0, 5.0}};
//        double[][] matrixB = new double[][]{{7.0, 3.0}, {8.0, 0.0}}; // Результат Matrix C: {{0.0, 3.0}, {8.0, 5.0}}

        double[][] c = new double[2][2];
        System.out.println("Matrix A");
        printMatrix(matrixA);
        System.out.println("Matrix B");
        printMatrix(matrixB);
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                long a = Double.doubleToRawLongBits(matrixA[i][j]);
                long b = Double.doubleToRawLongBits(matrixB[i][j]);
                long res = a^b;
                c[i][j] = Double.longBitsToDouble(res);
            }
        }
        System.out.println("Matrix C");
        printMatrix(c);
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
