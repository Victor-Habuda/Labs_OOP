package lab1;

public class Matrix {
    protected double[][] matrixA;
    protected double[][] matrixB;
    protected double[][] matrixC;
    public Matrix(double a11, double a12, double a21, double a22,double b11, double b12, double b21, double b22) {
        this.matrixA = new double[][]{{a11, a12}, {a21, a22}};
        this.matrixB = new double[][]{{b11, b12}, {b21, b22}};
    }
    public Matrix (){}

    public void setMatrixA(double[][] matrixA) {
        this.matrixA = matrixA;
    }

    public void setMatrixB(double[][] matrixB) {
        this.matrixB = matrixB;
    }


    public void printMatrixA() {
        for (int i = 0; i < matrixA.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.printf("%5.1f", matrixA[i][j]);
            }
            System.out.println("]");
        }
    }
    public void printMatrixB() {
        for (int i = 0; i < matrixB.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.printf("%5.1f", matrixB[i][j]);
            }
            System.out.println("]");
        }
    }
    public void printMatrixC() {
        for (int i = 0; i < matrixC.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.printf("%5.1f", matrixC[i][j]);
            }
            System.out.println("]");
        }
    }

    public double[][] getMatrixA (){
        return matrixA;
    }
    public double[][] getMatrixB (){
        return matrixB;
    }
    public double[][] getMatrixC (){
        return matrixC;
    }

    public double[][] xor() {
        matrixC = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                long a = Double.doubleToRawLongBits(matrixA[i][j]);
                long b = Double.doubleToRawLongBits(matrixB[i][j]);
                long res = a ^ b;
                matrixC[i][j] = Double.longBitsToDouble(res);
            }
        }
        return matrixC;
    }
}
