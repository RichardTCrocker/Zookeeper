public class Mammal {
    
    public int energy = 100;

    public int displayEnergy(){
        System.out.println("Energy level: " + this.energy);
        return this.energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
