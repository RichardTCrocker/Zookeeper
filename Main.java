public class Main {
    public static void main(String[] args) {
        Gorilla Steve = new Gorilla();
        Steve.throwSomething();
        Steve.throwSomething();
        Steve.throwSomething();
        Steve.eatBananas();
        Steve.eatBananas();
        Steve.climb();
        System.out.println(Steve.getEnergy());

        Bat Bob = new Bat();
        Bob.setEnergy(300);
        System.out.println(Bob.getEnergy());
        Bob.attackTown();
        Bob.attackTown();
        Bob.attackTown();
        Bob.eatHumans();
        Bob.eatHumans();
        Bob.fly();
        Bob.fly();
        System.out.println(Bob.getEnergy());

    }
}
