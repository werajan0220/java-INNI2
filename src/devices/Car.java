package devices;
import creatures.Human;
import java.util.ArrayList;

import javax.management.InvalidApplicationException;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Car extends Device implements Salleable {
    public Integer horsepower;
    public boolean isSold = false;
    public boolean isClean = false;

    public String toString() {
        return model + " " + producer + " " + horsepower + "hp $" + value;
    }

    public Car(String model, String producer, Integer yearOfProduction, Integer horsepower) {
        super(producer, model);
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer) && horsepower.equals(car.horsepower) && value.equals(car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, horsepower, value);
    }

    @Override
    public void turnOn() {
        System.out.println("Car is turned on now");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != null) {
            if (buyer.cash >= price) {
                this.isSold = true;
                seller.cash += price;
                buyer.cash -= price;
                buyer.setPurchasedCar(seller.getCar());
                seller.clearCar();
                System.out.println("SUCCESSFUL SALE");
            } else System.out.println("Buyer is poor, can't afford it!!! ");
        } else System.out.println("He's a scammer, there's nothing for sale!!! ");
    }

    public String getMake() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    class Phone {
        private String owner;
        private double balance;
        private List apps;

        public Phone(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
            this.apps = new ArrayList<>();
        }
    }
}

