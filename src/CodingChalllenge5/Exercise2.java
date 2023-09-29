package CodingChalllenge5;

public class Exercise2 {
    public static void main(String[] args) {
        int[] ex2 = new int[20];
        for (int i=0; i < ex2.length; i++){
            ex2[i] = i +1;
        }
        for ( int i : ex2){
            System.out.println(ex2[i-1]);
        }
    }
}
