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

    @Test
    void testGetAverageC() {
        Matrix obj = new Matrix();
        // Використовуємо нулі в матриці B, щоб матриця C стала точною копією матриці A
        double[][] matrixA = {{2.0, 4.0}, {6.0, 8.0}};
        double[][] matrixB = {{0.0, 0.0}, {0.0, 0.0}};

        obj.setMatrixA(matrixA);
        obj.setMatrixB(matrixB);

        // Виконуємо XOR (матриця C тепер {{2.0, 4.0}, {6.0, 8.0}})
        obj.xor();

        // Очікуване середнє: (2 + 4 + 6 + 8) / 4 = 20 / 4 = 5.0
        double expectedAverage = 5.0;
        double actualAverage = obj.getAvgC();

        assertEquals(expectedAverage, actualAverage, "Середнє значення обчислено неправильно");
    }

}