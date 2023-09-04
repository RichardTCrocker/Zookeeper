public class Bat extends Mammal{
    
    public void fly(){
        this.energy -= 50;
        System.out.println("The Bat is airborne.");
    }

    public void eatHumans(){
        this.energy += 25;
        System.out.println("The Bat has eaten some humans.");
    }

    public void attackTown(){
        this.energy -= 100;
        System.out.println("The Bat has attacked a town.");
    }
}