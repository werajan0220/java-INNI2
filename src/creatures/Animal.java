package creatures;

public class Animal implements Ownable {
   final String species;
    String name;
    Double weight;
    Boolean isAlive;
    Human owner;
    Animal(String species, String name, Double weight, Boolean isAlive){
       this.isAlive = true;
       this.species = species ;

    }
     void feed()
     {
        if (isAlive)
        this.weight -= 0.5;
        System.out.println("Dziękuję za jedzonko ");

    }

      void takeForWalk() {
            if(isAlive) {
                System.out.println("HALO POLICJA");
            } else{
                this.weight -=0.5;
                System.out.println("Dzięki za spacer");
            }
            if (this.weight <= 0) {
                this.isAlive = false;
                this.weight = 0.0;
            }
    }
    public String toString(){
        return weight+ " "+species;
    }

    @Override
    public Human getOwner() {
        return this.owner;
    }

    @Override
    public Boolean isOwned() {
        return this.owner != null;
    }
    abstract void turnOn();
}
