import devices.Car;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("kotecek");
        Integer x = 4;

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

        Car fiat = new Car("Fiat", "BMW");
        Car audi = new Car("Fiat", "AlfaRomeo");

        me.setSalary(9000.0);
        me.setCar( fiat, me.getSalary());
        //ctr+alt+l
        System.out.println(fiat.equals(audi));
        System.out.println(audi);
        System.out.println(fiat);
        System.out.println(cat);
        System.out.println(me);
//
    }
}