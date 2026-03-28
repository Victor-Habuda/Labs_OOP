package lab1;

public class Matrix {
    protected double a11;
    protected double a12;
    protected double a21;
    protected double a22;
    protected double[][] matrix;
    public Matrix(double a11, double a12, double a21, double a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;
        this.matrix = new double[][]{{a11, a12}, {a21, a22}};
    }
    public Matrix () {}
    public Matrix (double[][] matrix) {
        this.matrix = matrix;
    }
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5.1f", matrix[i][j]);
            }
            System.out.println("]");
        }
    }

    public double[][] getMatrix (){
        return matrix;
    }
}
