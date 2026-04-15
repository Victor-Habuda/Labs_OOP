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

    public Set<String> processText() {
        Set<String> uniqueWords = new HashSet<>();
        if (this.text == null || this.text.length() == 0 || this.targetLength <= 0) {
            return uniqueWords;
        }
        int sentenceStart = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == '.' || currentChar == '!' || currentChar == '?') {
                if (currentChar == '?') {
                    StringBuilder currentWord = new StringBuilder();
                    for (int j = sentenceStart; j < i; j++) {
                        char wordChar = text.charAt(j);
                        if (Character.isLetter(wordChar)) {
                            currentWord.append(wordChar);
                        } else {

                            if (currentWord.length() == this.targetLength) {

                                uniqueWords.add(currentWord.toString().toLowerCase());
                            }
                            currentWord.setLength(0);
                        }
                    }

                    if (currentWord.length() == this.targetLength) {
                        uniqueWords.add(currentWord.toString().toLowerCase());
                    }
                }

                sentenceStart = i + 1;
                while (sentenceStart < text.length() && Character.isWhitespace(text.charAt(sentenceStart))) {
                    sentenceStart++;
                }
            }
        }

        return uniqueWords;
    }
}
