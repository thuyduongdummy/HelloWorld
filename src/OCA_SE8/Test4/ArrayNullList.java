package OCA_SE8.Test4;

import java.util.ArrayList;
import java.util.List;

public class ArrayNullList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add(0, "Array");
        list.add(2, "List");

        System.out.println(list);
    }
}
