package guru.springframework.sfgoopsolid.toys.inventory;

import guru.springframework.sfgoopsolid.toys.interfaces.Moveable;
import guru.springframework.sfgoopsolid.toys.interfaces.Toy;

public class ToyCar implements Toy, Moveable {
    double price;
    String color;

    @Override
    public String toString() {
        return "ToyCar{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
