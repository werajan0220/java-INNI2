package devices;

public abstract class Car {

    private final String producer;
    // pola klasy Car
    private String make;
    private String model;
    private int year;
    private int price;

    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // abstrakcyjna metoda tankująca samochód
    public abstract void refuel();
    public Car(String producer, String mark, int year, int price) {
        super(producer, mark);
        this.producer = producer;
        this.mark = mark;
    }
    @Override
    void turnOn(){
        System.out.println("przekręcam kluczyk");
        System.out.println("Samochód ruszył");
    }
    public String toString(){
        return mark+ " "+millage+ " "+power;
    }

    public String getModel(Tesla) {
    }

    public String getMake() {
    }
}
