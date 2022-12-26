package creatures;

public class Animal implements Ownable {
    private static final String DEFUALT_FOOD_TYPE = ;
    final String species;
    String name;
    Double weight;
    Boolean isAlive;
    Human owner;
    Animal(String species, String name, Double weight, Boolean isAlive){
       this.isAlive = true;
       this.species = species ;

    }
     void feed(){
        this.feed(DEFAULT_FOOD_WEIGHT);
    }
     void feed(Double foodWeight){
        this.feed(foodWeight, DEFUALT_FOOD_TYPE);
     }
     void feed(Double foodWeight, String foodType){
        if(isAlive){
            switch (foodType){
                case "meet" -> this.weight += foodWeight;
                        case "crops" -> this.weight += (0.5 * foodWeight);
            }
            System.out.println("dziękuję za jedzenie");
        }else{
            System.out.println("Szkoda że mnie nienakarmiłeś");
        }
     }
    void takeForWalk(){
        this.feed(DEFAULT_);
    }
    void takeForWalk(Double foodWeight){
        this.feed(foodWeight, DEFUALT_FOOD_TYPE);
    }
    void takeForWalk(Double , boolean czyBiegniemy){
        if(isAlive){
            switch (foodType){
                case "meet" -> this.weight += foodWeight;
                case "crops" -> this.weight += (0.5 * foodWeight);
            }
            System.out.println("Dzięki za spacer");
        }else{
            System.out.println("HALO POLICJA");
        }
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
