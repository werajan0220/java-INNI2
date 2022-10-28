import devices.Car;
import devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Integer yearOfBirth;

    private Car car;
    Phone iphone;
    private Double salary;

    public Double getSalary() {
        System.out.println("Dane zostay zaciągnięte pierwszego dnia miesiąca");
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
        if (this.salary < 0) {
          System.out.println("Próba wpisania ujemnej wartości");
        }
        else {
            this.salary = salary;
            System.out.println("Wpisane zostały ujemne wartości");
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Konieczność odebrania aneksu od Pani Hani K. z kadr");
            System.out.println("ZUS | US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car, Double salary) {

        if (this.salary>car.ofkoz){
            System.out.println("Samochód udało się kupić za gotówkę");
            this.car = car;
        }
         else if (salary>1/12*car.ofkoz){
            System.out.println("Samochód udało się kupić za kredyt");
            this.car = car;
        }
         else{
            System.out.println("Przykro mi nie udało się kupić, za mało środków ");
        }
    }

    public String toString(){
        return salary+ " "+pet;
    }

}
