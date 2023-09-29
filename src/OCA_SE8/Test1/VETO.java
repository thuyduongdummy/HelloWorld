package OCA_SE8.Test1;

import java.util.ArrayList;
import java.util.List;

public class VETO {
    public static void main(String[] args) {

        List<String> list0 = new ArrayList<String>();
//        List<String> list00 = new List<>();
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('O');
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}
