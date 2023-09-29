package OCA_SE8.Test3;

public class Sub extends Super {
        public Sub() {
            super();
            System.out.println(200);
        }
    }

    class Test {
        public static void main(String[] args) {
            new OCA_SE8.Test3.Sub();
        }
}
