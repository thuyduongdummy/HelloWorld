package OCA_SE8.Test5.MN;

public class Test {
    public static void main(String[] args) {
        M obj1 = new M();
        N obj2 = (N)obj1;
        obj2.printName();
        new N();
    }
}
