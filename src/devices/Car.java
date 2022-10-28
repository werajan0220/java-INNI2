package devices;

public class Car {
       final String producer;
        final String mark;
        Double millage;
        Integer yearOfProduction;
        Double power;
        public Double ofkoz=4000.0;

    public Car(String producer, String mark) {
        this.producer = producer;
        this.mark = mark;
    }
    public String toString(){
        return mark+ " "+millage+ " "+power;
    }

}
