package frc.robot.controls;

import java.util.HashMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.controls.models.ModelEntry;
import frc.robot.controls.schemes.Drive;
import frc.robot.controls.schemes.Scheme;

public class Controller {
    private final HashMap<Integer, Joystick> joysticks = new HashMap<>();

    private final Scheme scheme = new Drive();

    private Joystick getJoystick(final int id) {
        if (!joysticks.containsKey(id)) {
            joysticks.put(id, new Joystick(id));
        }
        return joysticks.get(id);
    }

    public boolean getRawButton(final ModelEntry entry) {
        return getJoystick(entry.joystickId).getRawButton(entry.entryId);
    }

    private Button buttonFromEntry(final ModelEntry entry) {
        // TODO: allow multiple entries passed in
        // TODO: handle null entries
        return new Button(() -> getRawButton(entry));
    }

    public Button driveForward() {
        return buttonFromEntry(scheme.driveForward());
    }
}
