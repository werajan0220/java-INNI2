package devices;

import creatures.Human;

public abstract class Salleable {
    public abstract void sell(Human seller, Human buyer, Double price);

    public void setSalary(double v) {
    }
}
