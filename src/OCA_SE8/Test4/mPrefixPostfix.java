package OCA_SE8.Test4;

public class mPrefixPostfix {
    public static void main(String [] args) {
        int a = 3;
        m(++a, a++);
        System.out.println(a);
    }

    private static void m(int i, int j) {
        i++;
        j--;
    }
}
