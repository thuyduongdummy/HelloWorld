package OCA_SE8;

public class StrEqualsSb {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
    }
}
