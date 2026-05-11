package lab4;

public class Sentence {
    private final Object[] elements; // Can contain Word or Punctuation

    public Sentence(String sentenceStr) {
        // Simple regex to split by word boundaries but keep punctuation
        String[] tokens = sentenceStr.split("(?=[,.!?;])|\\s+");
        elements = new Object[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].trim();
            if (token.matches("[,.!?;]")) {
                elements[i] = new Punctuation(token.charAt(0));
            } else {
                elements[i] = new Word(token);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i].toString());
            if (i < elements.length - 1 && !(elements[i+1] instanceof Punctuation)) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
