package OCA_SE8;

public class CatchOutException {
    public static void main(String[] args) {
        try {
            main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
    }
}
