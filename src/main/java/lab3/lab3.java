package lab3;

public class lab3 {
    public static void main(String[] args) {
        getVariant();
        Block air = new Block(0, "block", "air.png", false, false);

    }
    public static void getVariant(){
        int id = 5103;
        int c11 = id % 11;
        System.out.println(c11);
    }

}
