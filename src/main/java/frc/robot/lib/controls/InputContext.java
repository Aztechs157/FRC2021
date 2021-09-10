package frc.robot.lib.controls;

import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.wpilibj.Joystick;

public class InputContext {
    private final Map<Integer, Joystick> joysticks = new HashMap<>();

    public Joystick getJoystick(final int id) {
        return joysticks.computeIfAbsent(id, Joystick::new);
    }
}
