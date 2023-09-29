package OCA_SE8.Test2;

import OCA_SE8.Test1.A;

public class Test2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = (B)obj1;
        obj2.print();
        StringBuilder sb = new StringBuilder();
       // System.out.println(sb.append(null).length());
    }
}
