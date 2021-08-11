package frc.robot.controls;

import java.util.HashMap;
import java.util.Map;

public class Layout {
    private final Map<String, ButtonJoystickId> buttons = new HashMap<>();

    public Layout assign(String action, ButtonJoystickId buttonJoystickId) {
        buttons.put(action, buttonJoystickId);
        return this;
    }

    public ButtonJoystickId getButton(String action) {
        return buttons.get(action);
    }
}
