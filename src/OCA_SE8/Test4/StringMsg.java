package OCA_SE8.Test4;

public class StringMsg {
    static String msg; //Line 2
    public static void main(String[] args) {
        String msg = new String(); //Line 4
        if(args.length > 0) {
            msg = args[0]; //Line 6
        }
        System.out.println(msg); //Line 8




        double area = 5.7;
        String color = null;
        if (area < 7)
            color = "green";

        System.out.println(color);
    }
}
