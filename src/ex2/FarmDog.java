package ex2;

public class FarmDog {
    public Dog[] dogs = new Dog[100];
    public int i;
    public int j = 0;

    public void addDog(Dog dog1) {
        dogs[i] = dog1;
        i++;
    }

    public void addAlldogs() {
        for (int k = 0; k <= i; k++) {
            if (dogs[k] != null) {
                System.out.println(dogs[k]);
            }
        }

    }
}