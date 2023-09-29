package OCA_SE8.Theory;

public class Vararg {
    public static int count (boolean b, boolean ...b2){
        return b2.length;
    }
    public static void  main (String[] arg){
        Vararg method = new Vararg();
       method.count(true, true, true);

        int k = 0;
        for (int i = 10; i > 0; i--) {
            while (i > 3) i -= 3;
            k += 1;
        }
        System.out.println(k);
    }
}
