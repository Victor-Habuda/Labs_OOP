package lab4;

public class lab4 {
    public static void main(String[] args) {
        String input = "Це перше речення.    Це \t друге речення з   багатьма   пробілами!";

        // 1. Створення об'єкта тексту (всередині відбувається очищення пробілів/табуляцій)
        Text text = new Text(input);

        System.out.println("Оброблений текст:");
        System.out.println(text.toString());


    }



}
