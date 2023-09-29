package OCA_SE8.Test1;

public class Dog {
    private String breed;
    Dog(String breed) {
        this.breed = breed;
    }

//    Dog(String name, String breed) {
//        super(name);
//        this.breed = breed;
//    }

    public String getBreed() {
        return breed;
    }
}

//public class Test {
//    public static void main(String[] args) {
//        Dog dog1 = new Dog("Beagle");
//        Dog dog2 = new Dog("Bubbly", "Poodle");
//        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
//                dog2.getName() + ":" + dog2.getBreed());
//    }
//}
