package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void testWhitespaceNormalization() {
        // Перевірка заміни табуляцій та множинних пробілів на один пробіл
        String input = "Слово1\t\tСлово2    Слово3";
        Text text = new Text(input);

        // Очікуємо, що між словами буде лише по одному пробілу
        assertEquals("Слово1 Слово2 Слово3", text.toString());
    }

    @Test
    void testSentenceParsing() {
        // Перевірка розділення на речення
        String input = "Перше речення. Друге речення!";
        Text text = new Text(input);

        String result = text.toString();
        assertTrue(result.contains("Перше речення."));
        assertTrue(result.contains("Друге речення!"));
    }

    @Test
    void testWordAndPunctuation() {
        // Перевірка, чи правильно обробляється пунктуація (без зайвих пробілів перед нею)
        String input = "Привіт, світ!";
        Text text = new Text(input);

        assertEquals("Привіт, світ!", text.toString());
    }

    @Test
    void testEmptyString() {
        // Граничний випадок: порожній рядок
        Text text = new Text("");
        assertEquals("", text.toString().trim());
    }
}