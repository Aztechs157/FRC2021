package frc.robot.lib.controls;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.button.Button;

public class ControllerBase<Action, Axis> {
    private final Map<Integer, Joystick> joysticks = new HashMap<>();

    private Joystick getJoystick(final int id) {
        return joysticks.computeIfAbsent(id, Joystick::new);
    }

    private SendableChooser<LayoutBase<Action, Axis>> layouts = new SendableChooser<>();
    private boolean isEmpty = true;

    {
        Shuffleboard.getTab("Config").add("Layout", layouts);
    }

    public void add(final LayoutBase<Action, Axis> layout) {
        if (isEmpty) {
            isEmpty = false;
            layouts.setDefaultOption(layout.name, layout);
        } else {
            layouts.addOption(layout.name, layout);
        }
    }

    public Button getButton(final Action action) {
        return new Button(() -> {
            final var entries = layouts.getSelected().getButtons(action);
            return Arrays.stream(entries).allMatch(entry -> {
                return getJoystick(entry.joystickId).getRawButton(entry.buttonId);
            });
        });
    }

    public double getAxis(final Axis axis) {
        final var entry = layouts.getSelected().getAxis(axis);
        return getJoystick(entry.joystickId).getRawAxis(entry.axisId);
    }
}
