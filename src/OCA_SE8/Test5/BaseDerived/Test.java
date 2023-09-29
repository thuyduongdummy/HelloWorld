package OCA_SE8.Test5.BaseDerived;

public class Test {
    public static void main(String[] args) {
        Base b = null;
        Derived d = (Derived) b; //Line n3
        d.print(); //Line n4
    }
}
