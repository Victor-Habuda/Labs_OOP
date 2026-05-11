package lab4;

public class Text {
    private final Sentence[] sentences;

    public Text(String rawText) {
        // Replace tabs and multiple spaces with a single space as per task
        String cleanedText = rawText.replaceAll("[\\t ]+", " ");

        // Split by sentence endings (., !, ?)
        String[] sentenceStrings = cleanedText.split("(?<=[.!?])\\s*");
        sentences = new Sentence[sentenceStrings.length];

        for (int i = 0; i < sentenceStrings.length; i++) {
            sentences[i] = new Sentence(sentenceStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            sb.append(sentences[i].toString());
            if (i < sentences.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}