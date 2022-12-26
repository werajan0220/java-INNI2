package devices;

public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;
    public Integer value;

    public Device(String producer, String model, Integer yearOfProduction, Integer value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
    public String toString(){
        return model + " " + producer + " " + yearOfProduction + " $" + value;
    }

    abstract public void turnOn();


}

// klasa diesla dziedzicząca po klasie Car
public class Diesel extends Car {

    // pole z pojemnością zbiornika paliwa
    private int fuelCapacity;

    public Diesel(String make, String model, int year, int price, int fuelCapacity) {
        super(make, model, year, price);
        this.fuelCapacity = fuelCapacity;
    }

    // metoda zwracająca pojemność zbiornika paliwa samochodu
    public int getFuelCapacity() {
