package ex3;

public class Human {
    public static void main(String[] args) {
        Hand hand = new Hand(30);
        Head head = new Head(4);
        Leg leg = new Leg(78);
        System.out.println(hand.toString());
        System.out.println(head.toString());
        System.out.println(leg.toString());

    }
}
