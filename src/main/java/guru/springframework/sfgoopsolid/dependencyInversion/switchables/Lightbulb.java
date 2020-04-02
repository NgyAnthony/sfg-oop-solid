package guru.springframework.sfgoopsolid.dependencyInversion.switchables;

import guru.springframework.sfgoopsolid.dependencyInversion.interfaces.Switchable;

public class Lightbulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Lightbulb turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lightbulb turned off.");
    }
}
