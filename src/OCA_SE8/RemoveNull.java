package OCA_SE8;

import java.util.ArrayList;
import java.util.List;

public class RemoveNull {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}
