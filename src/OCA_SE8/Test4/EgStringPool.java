package OCA_SE8.Test4;

import java.util.ArrayList;
import java.util.List;

public class EgStringPool {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add(new String("Java")); //Line 3
        list.add("JaVa"); //Line 4
        list.add("JaVa"); //Line 5
        list.add("Java"); //Line 6
        list.add("Java"); //Line 7
        System.out.println(list);
        int i = 1; //Line 9

    }
}
