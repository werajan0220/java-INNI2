package devices;

public class Phone {
    final String producer;
   final String mark;
    Double millage;
    Integer yearOfProduction;
    Double power;
    String color;

    public Phone (String producer,String mark) {
        this.producer = producer;
        this.mark = mark;
    }
    public String toString(){
        return mark+ " "+power;
    }

}

