package frc.robot.lib.controls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;

public class ControllerBase<Action, Axis> {
    private final Map<Integer, Joystick> joysticks = new HashMap<>();

    private Joystick getJoystick(int id) {
        return joysticks.computeIfAbsent(id, Joystick::new);
    }

    private final ArrayList<LayoutBase<Action, Axis>> layouts = new ArrayList<>();
    private int currentLayout = 0;

    public void toggleLayout() {
        currentLayout++;
        currentLayout %= layouts.size();
    }

    public void add(LayoutBase<Action, Axis> layout) {
        layouts.add(layout);
    }

    public Button getButton(Action action) {
        return new Button(() -> {
            var entry = layouts.get(currentLayout).getButton(action);
            return getJoystick(entry.joystickId).getRawButton(entry.buttonId);
        });
    }

    public double getAxis(Axis axis) {
        var entry = layouts.get(currentLayout).getAxis(axis);
        return getJoystick(entry.joystickId).getRawAxis(entry.axisId);
    }
}
