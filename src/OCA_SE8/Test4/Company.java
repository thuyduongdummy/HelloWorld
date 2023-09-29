package OCA_SE8.Test4;

public class Company {
    public static void main(String[] args){
//        int a = 127;  // byte max positive range
//        System.out.println("int value = "+a);
//        byte b = (byte) a;
//        System.out.println("byte value = "+b);
//        a = 130; // Out of positive byte range
//        System.out.println("int value = "+a);
//        b = (byte) a;
//        System.out.println("byte value = "+b);


        int x = 0;
        x = x++;
        System.out.println( x );

        int x1=50, x2 = 75;
        boolean b = x1 >= x2;
        if(b==true) System.out.println("Success");
        else System.out.println("Failure");
    }
}
