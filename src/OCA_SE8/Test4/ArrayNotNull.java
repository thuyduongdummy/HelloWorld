package OCA_SE8.Test4;

public class ArrayNotNull {
    private static int [] arr;
    public static void main(String [] args) {
        if(arr != null  && arr.length > 0) {
            System.out.println(arr[0]);
        }
    }
}
