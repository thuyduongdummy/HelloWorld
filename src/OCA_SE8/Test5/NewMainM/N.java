package OCA_SE8.Test5.NewMainM;

public class N {
    public static void main(String[] args) { //Line n2
        new M().main(args); //Line n3
        String[] arr = { "L", "I", "V", "E" }; //Line n1
        int i = -2;

        if (i++ == -1) { //Line n2
            arr[-(--i)] = "F"; //Line n3
        } else if (--i == -2) { //Line n4
            arr[-++i] = "O"; //Line n5
        }

        for(String s : arr) {
            System.out.print(s);
        }
    }
}
