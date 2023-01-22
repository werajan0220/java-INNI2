package devices;

public abstract class Device {
    final public String producer;
    public String model;
    final public Integer yearOfProduction;
    public Integer value;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " $" + value;
    }

    abstract public void turnOn();
}

