package CodingCHallenge3;
public class Exercise2 {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;

        if (x > y) {
            System.out.println("x is bigger than y by " + (x - y));
        }
        else if (x == y){
            System.out.println("x and y are the same");
        }
        else {
            System.out.print("x is smaller than y by " + (x-y));
        }
    }

}
