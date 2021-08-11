package frc.robot.controls;

import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;

public class ControllerBase {
    private final Map<Integer, Joystick> joysticks = new HashMap<>();

    private Joystick getJoystick(int id) {
        return joysticks.computeIfAbsent(id, Joystick::new);
    }

    private final Map<String, Layout> layouts = new HashMap<>();
    private String currentLayout = "First";

    public void toggleLayout() {
        if (currentLayout == "First") {
            currentLayout = "Second";
        } else if (currentLayout == "Second") {
            currentLayout = "First";
        }
    }

    public void add(Layout layout) {
        layouts.put(layout.name, layout);
    }

    public Button getButton(String action) {
        return new Button(() -> {
            var entry = layouts.get(currentLayout).getButton(action);
            return getJoystick(entry.joystickId).getRawButton(entry.buttonId);
        });
    }
}
