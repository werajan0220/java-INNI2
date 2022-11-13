package devices;

public abstract class Device {
    protected final String producer;
    public final String model;
    public Integer yearOfProduction;
    public String colour;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = this.yearOfProduction;
        this.colour = colour;

    }
    abstract void turnOn();

}
