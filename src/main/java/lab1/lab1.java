package lab1;

public class lab1 {
    public static void main (String[] args){


//        getVariant(); //c5 = 3, c7 = 0, c11 = 10
    Matrix obj = new Matrix();
    obj.setMatrixA(new double[][]{{1.0, 2.0}, {0.0, 2.0}});
    obj.setMatrixB(new double[][]{{0.0, 2.0}, {1.0, 2.0}});
    obj.printMatrixA();
    obj.printMatrixB();
    obj.xor();
    obj.printMatrixC();

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
