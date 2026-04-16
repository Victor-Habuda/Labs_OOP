package lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class lab2Test {

    private Processor processor;

    @BeforeEach
    void setUp() {
        processor = new Processor();
    }

    @Test
    void testProcessTextWithQuestionMarks() {
        StringBuilder text = new StringBuilder("I love this. Is it java? Do you want test?");
        processor.setText(text);
        processor.setTargetLength(4);

        Set<String> result = processor.processText();

        assertTrue(result.contains("java"));
        assertTrue(result.contains("want"));
        assertTrue(result.contains("test"));

        assertFalse(result.contains("love"));
        assertFalse(result.contains("this"));

        assertEquals(3, result.size(), "Кількість знайдених слів має бути 3 (java, want, test)");
    }

    @Test
    void testEmptyText() {
        processor.setText(new StringBuilder(""));
        processor.setTargetLength(5);

        Set<String> result = processor.processText();

        assertTrue(result.isEmpty(), "Результат має бути порожнім для порожнього тексту");
    }

    @Test
    void testNoMatchesInQuestions() {
        processor.setText(new StringBuilder("Хто це? Що там?"));
        processor.setTargetLength(10);

        Set<String> result = processor.processText();

        assertEquals(0, result.size());
    }

    @Test
    void testCaseInsensitivityAndDuplicates() {
        processor.setText(new StringBuilder("Java java JAVA?"));
        processor.setTargetLength(4);

        Set<String> result = processor.processText();

        assertEquals(1, result.size());
        assertTrue(result.contains("java"));
    }
}