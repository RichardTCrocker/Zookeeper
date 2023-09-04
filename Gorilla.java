public class Gorilla extends Mammal{
    
    public void throwSomething(){
        this.energy -= 5;
        System.out.println("The Gorilla has thrown something.");
    }

    public void eatBananas(){
        this.energy += 10;
        System.out.println("The Gorilla has eaten some bananas.");
    }

    public void climb(){
        this.energy -= 10;
        System.out.println("The Gorilla has climbed a tree.");
    }
}