package lab2;

public class lab2 {
    public static void main(String[] args) {
//        getVariant();
        StringBuilder text = new StringBuilder("Првіт! Як у тебе справи?У мене чудово.");
        Processor obj = new Processor();
        obj.setTargetLength(4);
        obj.setText(text);
        System.out.println(obj.processText());
    }
    public static void getVariant() {
        int id = 5103;
        int c3 = id % 3;
        int c17 = id % 17;
        System.out.println("c3: " + c3);
        System.out.println("c17: " + c17);
    }
}
