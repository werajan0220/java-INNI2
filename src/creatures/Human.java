package creatures;

import devices.Car;
import devices.Phone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Human  extends Animal {

    String firstName;
    String lastName;
    Double salary = 2000.0;
    Double previousSalary;
    public Double cash;
    public Pet pet;
    Integer yearOfBirth;
    public Phone phone;
    private Car car;
    LocalDateTime ldt;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Human(String firstName, String lastName, String yearOfBirth, String cash) {
        super("homo sapiens", name, weight, isAlive);
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = Integer.valueOf(yearOfBirth);
        this.cash = Double.valueOf(cash);
    }

    public void displayHuman() {
        System.out.println("Imię:" + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Data urodzenia: " + yearOfBirth);
    }

    public String getInformationAboutSalary(Car Car) {
        System.out.println("Dane zostay zaciągnięte pierwszego dnia miesiąca");
        System.out.println("Wypłata przed zmianą" + previousSalary);
        System.out.println("Obecny stanwypłąty:" + salary);
        String toString;
        return salary + " " + pet;
        if (this.salary < 0) {
            System.out.println("Wpisana wartość jest ujemna. Zmiany nie mogą zostać zapisane");
        } else {
            ldt = LocalDateTime.now();
            System.out.println("Wpisane zostały ujemne wartości");
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Konieczność odebrania aneksu od Pani Hani K. z kadr");
            System.out.println("ZUS | US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.previousSalary = this.salary;
            this.salary = salary;
        }
        if (this.salary > car.value) {
            System.out.println("Samochód udało się kupić za gotówkę");
            this.car = car;
        } else if (salary > 1 / 12 * car.value) {
            System.out.println("Samochód udało się kupić za kredyt");
            this.car = car;
        } else {
            System.out.println("Przykro mi nie udało się kupić, za mało środków ");
        }
    }

    public void displayPet() {
        if (!(pet == null)) {
            System.out.println("Masz zwierzaka o imieniu: " + pet.name);
            System.out.println("Waga zwierzęcia:" + pet.weight);
        } else {
            System.out.println("Nie masz żadnego zwierzęcia");
        }
    }

    public Car getCar() {
        return Car;
    }

    public void clearCar() {
        if (car.isSold) {
            this.car = null;
        } else System.out.println("You can't do that");
    }

    public void setPurchasedCar() {
        Object Car;
        return (Car);
    }

    public void setPurchasedCar(Car car) {
    }

    public Object getSalary() {

        public void setCar (Car Object fiat);
    }

    public void setCar(Car fiat, Object salary) {
    }
}