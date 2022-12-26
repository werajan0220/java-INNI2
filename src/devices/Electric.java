package devices;

// klasa elektrycznego dziedzicząca po klasie Car
public class Electric extends Car {

    // pole z pojemnością baterii
    private int batteryCapacity;

    public Electric(String make, String model, int year, int price, int batteryCapacity) {
        super(make, model, year, price);
        this.batteryCapacity = batteryCapacity;
    }

    // metoda zwracająca pojemność baterii samochodu
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

}
