package OCA_SE8.Test3;

public class objError {
    public static void main(String[] args) {
        Error obj = new Error();
//        boolean flag1 = obj instanceof RuntimeException; //Line n1
//        boolean flag2 = obj instanceof Exception; //Line n2
        boolean flag3 = obj instanceof Error; //Line n3
        boolean flag4 = obj instanceof Throwable; //Line n4
        System.out.println(flag3 + ":" + flag4);
    }
}
