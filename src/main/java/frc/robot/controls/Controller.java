package frc.robot.controls;

import java.util.HashMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.controls.schemes.First;
import frc.robot.controls.schemes.Scheme;

public class Controller {
    private final HashMap<Integer, Joystick> joysticks = new HashMap<>();

    private final Scheme scheme = new First();

    private Joystick getJoystick(final int id) {
        if (!joysticks.containsKey(id)) {
            joysticks.put(id, new Joystick(id));
        }
        return joysticks.get(id);
    }

    public boolean getRawButton(final SchemeEntry entry) {
        return getJoystick(entry.joystickId).getRawButton(entry.entryId);
    }

    public Button printFoo() {
        return new Button(() -> getRawButton(scheme.printFoo()));
    }

    public Button printBar() {
        return new Button(() -> getRawButton(scheme.printFoo()));
    }
}
