package OCA_SE8.Test4;

public class ResAndOr {
    public static void main(String[] args) {
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);



        Boolean [] arr = new Boolean[2];
        System.out.println(arr[0] + ":" + arr[1]);
    }
}
