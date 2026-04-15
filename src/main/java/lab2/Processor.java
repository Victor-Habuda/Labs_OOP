package lab2;

import java.util.HashSet;
import java.util.Set;

public class Processor {
    protected StringBuilder text;
    protected int targetLength;

    public void setText(StringBuilder text) {
        this.text = text;
    }
    public void setTargetLength(int length){
        targetLength = length;
    }

    public void processText() {

        if (text == null || text.length() == 0) {
            System.out.println("Текст порожній.");
            return;
        }

        if (targetLength <= 0) {
            System.out.println("Довжина слова має бути більшою за 0.");
            return;
        }


        String[] sentences = text.toString().split("(?<=[.!?])\\s*");
        Set<String> uniqueWords = new HashSet<>();

        for (String sentence : sentences) {
            if (sentence.endsWith("?")) {
                String cleanSentence = sentence.replaceAll("[^a-zA-Zа-яА-ЯіІїЇєЄґҐ\\s]", "");
                String[] words = cleanSentence.split("\\s+");
                for (String word : words) {
                    if (word.length() == targetLength) {
                        uniqueWords.add(word.toLowerCase());
                    }
                }
            }
        }

        if (uniqueWords.isEmpty()) {
            System.out.println("Слів заданої довжини у питальних реченнях не знайдено.");
        } else {
            System.out.println("Знайдені унікальні слова: " + uniqueWords);
        }
    }
}
