import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Integer x = 4;
        cat.species = "kotecek";
        cat.name = "Kitku";
        cat.weight = 0.1;

        System.out.print("MAsz zwierzę, nazywa się: ");
        System.out.println(cat.name);
        System.out.println(cat.isAlive);
        System.out.println(cat.species);
        cat.feed();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.takeForWalk();
        cat.feed();

        Human me = new Human();
        me.pet = cat;

        System.out.println(me.pet.species);
        me.pet.feed();

        me.pet = cat;
        System.out.println(me.pet.species);

        Car fiat = new Car("Fiat");
        me.car = fiat;
        System.out.println(me.car.producer);
        //ctr+alt+l
    }
}