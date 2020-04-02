package guru.springframework.sfgoopsolid.toys.inventory;

import guru.springframework.sfgoopsolid.toys.interfaces.Flyable;
import guru.springframework.sfgoopsolid.toys.interfaces.Moveable;
import guru.springframework.sfgoopsolid.toys.interfaces.Toy;

public class ToyPlane implements Flyable, Moveable, Toy {
    double price;
    String color;

    @Override
    public String toString() {
        return "ToyPlane{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying.");
    }

    @Override
    public void move() {
        System.out.println("Plane is moving.");
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
