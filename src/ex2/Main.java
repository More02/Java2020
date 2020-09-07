package ex2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Green", 45);
        Shape shape2 = new Shape("Black", 65);

        System.out.println("-------------");
        shape.setColor("Blue");
        System.out.println(shape2.getSidesCount());
        System.out.println(shape.getColor());

        System.out.println("-------------");
        Ball balll1 = new Ball ("voleyball", 32);
        Ball balll2 = new Ball ("basketball", 55);
        System.out.println(balll1.getType());
        System.out.println(balll2.getWeight());
        System.out.println(balll1.toString());
        System.out.println("-------------");

        Book book1 = new Book ("book abc", 325);
        Book book2 = new Book ("book cde", 267);
        System.out.println(book1.getName());
        System.out.println(book2.toString());

        Dog dog1 = new Dog ("Vasua", 7);
        Dog dog2 = new Dog ("Alb", 6);
        Dog dog3 = new Dog ("Albys", 4);
        FarmDog farm = new FarmDog();
        farm.addDog(dog1);
        farm.addDog(dog2);
        farm.addDog(dog3);
        farm.addAlldogs();


    }

}
