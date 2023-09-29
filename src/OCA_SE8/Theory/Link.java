package OCA_SE8.Theory;

public class Link {
    private final String name;
    private Link next;

    public Link(String name, Link next) {
        this.name = name;
        this.next = next;
    }

    public static void main(String... args) {
        Link link1 = new Link("x", null);
        Link link2 = new Link("y", link1);
        Link link3 = new Link("z", link2);
        link2.setNext(link3);
        link3.setNext(link2);
        link1 = null;
        link3 = null;

        System.out.println(link1);
        System.out.println(link2);
        System.out.println(link3);
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
