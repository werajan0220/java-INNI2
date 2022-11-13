package devices;

public class Phone extends Device {
    final String producer;
   final String mark;
    Double millage;
    Integer yearOfProduction;
    Double power;
    String color;
    public Phone (String producer,String mark, Integer yearOfProduction){
        super(producer, mark);
        this.producer = producer;
        this.mark = mark;
    }
    void turnOn() {
        System.out.println("wciskam guzik");
        System.out.println("działa");
    }
    public String toString(){
        return mark+ " "+power;
    }

}

