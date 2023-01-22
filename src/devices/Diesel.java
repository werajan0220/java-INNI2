package devices;

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
        return 0;
    }
}
