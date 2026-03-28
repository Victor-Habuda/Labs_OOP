package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Lab1Test {

    @Test
    void testXorOperations() {

        double a11 = 12.0, a12 = 14.0, a21 = 16.0, a22 = 18.0;
        double b11 = 0.0, b12 = 0.0, b21 = 0.0, b22 = 0.0;


//        double[][] result = lab1.xor(a11, a12, a21, a22, b11, b12, b21, b22);

        assertArrayEquals(new double[]{a11, a12}, result[0], "Рядок 0 не збігається");
        assertArrayEquals(new double[]{a21, a22}, result[1], "Рядок 1 не збігається");
    }

    @Test
    void testXorIdenticalValues() {

        double val = 123.456;
        double[][] result = lab1.xor(val, 0, 0, 0, val, 0, 0, 0);

        assertEquals(0.0, result[0][0], "XOR однакових double має повернути 0.0");
    }
}