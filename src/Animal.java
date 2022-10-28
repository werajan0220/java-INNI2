import java.awt.*;

public class Animal {
   final String species;
    String name;
    Double weight;
    Boolean isAlive;
    Animal(String species){
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
                System.out.println("Dzoęki za spacer");
            }
            if (this.weight <= 0) {
                this.isAlive = false;
                this.weight = 0.0;
            }
    }
    public String toString(){
        return weight+ " "+species;
    }
}
