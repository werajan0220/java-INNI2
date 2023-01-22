import devices.*;
import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;

public class Main {
    public static void main(String[] args) {
        String name = null;
        Double weight = null;
        Boolean isAlive = null;
        Animal cat = new Animal("kotecek", name, weight, isAlive) {
            @Override
            public void beEaten() {

            }
        };
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

        Human me = new Human("Weronika", "Jankowska", "2002", "1005.0") {
        };
        me.displayHuman();
        me.pet = (Pet) cat;
        System.out.println(me.pet.species);
        me.pet.feed();
        me.pet = (Pet) cat;
        System.out.println(me.pet.species);

        Integer year;
        Integer price;
        Car fiat = new Car("Fiat", "BMW", year, price);
        Car audi = new Car("Fiat", "AlfaRomeo", year, price);
        Wash wash = new Wash();
        me.setPurchasedCar(new Car);
        System.out.println(me.getCar());
        me.setSalary(9000.0);
        me.setCar(fiat, me.getSalary());
        //ctr+alt+l
        System.out.println(fiat.equals(audi));
        System.out.println(audi);
        System.out.println(fiat);
        System.out.println(cat);
        System.out.println(me);
    }

    <Application> void Application (String[] args) {
        Phone phone = new Phone("Anna Kowalska", 100);
        Application app1 = new Application("App1", "1.0", 10);
        Application app2 = new Application("App2", "2.0", 20);
        Application app3 = new Application("App3", "3.0", 0);
        Application app4 = new Application("App4", "4.0", 30);
        phone.installApp(app1);
        phone.installApp(app2);
        phone.installApp(app3);
        phone.installApp(app4);

        System.out.println("Aplikacja App2 jest zainstalowana: " + phone.isAppInstalled("App2"));
        System.out.println("Aplikacja App5 jest zainstalowana: " + phone.isAppInstalled("App5"));

        System.out.println("Bezpłatne aplikacje:");
        phone.printFreeApps();

        System.out.println("Wartość wszystkich zainstalowanych aplikacji: " + phone.getAppsValue());

        System.out.println("Nazwy wszystkich zainstalowanych aplikacji w kolejności alfabetycznej:");
        phone.printInstalledApps();

        System.out.println("Nazwy wszystkich zainstalowanych aplikacji od najtańszych do najdroższych:");
        phone.printInstalledAppsByPrice();
    }
}