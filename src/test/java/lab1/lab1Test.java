package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Lab1Test {

    @Test
    void testXorOperations() {
        Matrix obj = new Matrix();
        double[][] matrixA = {{12.0, 14.0}, {16.0, 18.0}};
        double[][] matrixB = {{0.0, 0.0}, {0.0, 0.0}};

        obj.setMatrixA(matrixA);
        obj.setMatrixB(matrixB);

        obj.xor();

        double[][] result = obj.getMatrixC();

        assertArrayEquals(matrixA[0], result[0], "Рядок 0 не збігається");
        assertArrayEquals(matrixA[1], result[1], "Рядок 1 не збігається");
    }

    @Test
    void testXorIdenticalValues() {
        Matrix obj = new Matrix();
        double val = 123.456;
        double[][] matrixA = {{val, 0.0}, {0.0, 0.0}};
        double[][] matrixB = {{val, 0.0}, {0.0, 0.0}};

        obj.setMatrixA(matrixA);
        obj.setMatrixB(matrixB);
        obj.xor();
        double[][] result = obj.getMatrixC();

        assertEquals(0.0, result[0][0], "XOR однакових double має повернути 0.0");
    }
}