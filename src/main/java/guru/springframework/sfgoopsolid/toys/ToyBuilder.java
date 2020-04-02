package guru.springframework.sfgoopsolid.toys;

import guru.springframework.sfgoopsolid.toys.interfaces.Toy;
import guru.springframework.sfgoopsolid.toys.inventory.ToyCar;
import guru.springframework.sfgoopsolid.toys.inventory.ToyHouse;
import guru.springframework.sfgoopsolid.toys.inventory.ToyPlane;

public class ToyBuilder {
    public static ToyHouse buildToyHouse(){
        ToyHouse toyHouse=new ToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("green");
        return toyHouse;
    }
    public static ToyCar buildToyCar(){
        ToyCar toyCar=new ToyCar();
        toyCar.setPrice(25.00);
        toyCar.setColor("red");
        toyCar.move();
        return toyCar;
    }
    public static ToyPlane buildToyPlane(){
        ToyPlane toyPlane=new ToyPlane();
        toyPlane.setPrice(125.00);
        toyPlane.setColor("white");
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }
}
