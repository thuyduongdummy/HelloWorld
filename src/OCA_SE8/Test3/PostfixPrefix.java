package OCA_SE8.Test3;

public class PostfixPrefix {
    public static void main(String[] args) {
        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);

    }

}
