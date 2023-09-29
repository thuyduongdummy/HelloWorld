package OCA_SE8.Theory;

public class Keyboard {
    private boolean numLock = true;
    static boolean capLock = false;
    public static void main(String... shortcuts) {
        System.out.print(new Keyboard()+" "+capLock);
    }
}
