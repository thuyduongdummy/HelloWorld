package OCA_SE8.Test2;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(27);
        list.add(27);

        list.add(new Integer(27));
        list.add(new Integer(27));

        System.out.println(list);
    }
}
