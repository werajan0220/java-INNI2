package devices;

public class Car extends Device {
       final String producer;
        final String mark;
        Double millage;
        Integer yearOfProduction;
        Double power;
        public Double ofkoz=4000.0;

    public Car(String producer, String mark ) {
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

}
