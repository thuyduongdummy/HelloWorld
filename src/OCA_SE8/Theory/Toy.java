package OCA_SE8.Theory;

public class Toy {
    public void play() {
        System.out.print("play-");
    }
    protected void finalize() {
        System.out.print("clean-");
    }
    public static void main(String[] fun) {
        Toy car = new Toy();
        car.play();
        System.gc();
        Toy doll = new Toy();
        doll.play();
    }
}
