package guru.springframework.sfgoopsolid.dependencyInversion;

import guru.springframework.sfgoopsolid.dependencyInversion.interfaces.Switch;
import guru.springframework.sfgoopsolid.dependencyInversion.interfaces.Switchable;
import guru.springframework.sfgoopsolid.dependencyInversion.switchables.Fan;
import guru.springframework.sfgoopsolid.dependencyInversion.switchables.Lightbulb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable lightbulb = new Lightbulb();
        Switch lightBulbSwitch = new ElectricPowerSwitch(lightbulb);

        lightBulbSwitch.press();
        lightBulbSwitch.press();

        Switchable fan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(fan);
        
        fanSwitch.press();
        fanSwitch.press();
    }
}
