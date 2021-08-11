package frc.robot.controls;

import java.util.HashMap;
import java.util.Map;

public class Layout {
    public final String name;

    public Layout(final String name) {
        this.name = name;
    }

    private int currentJoystick;

    public void onJoystick(final int joystickId) {
        currentJoystick = joystickId;
    }

    private final Map<String, ButtonEntry> buttons = new HashMap<>();

    public void assign(String action, ButtonId buttonId) {
        buttons.put(action, new ButtonEntry(buttonId.buttonId, currentJoystick));
    }

    public ButtonEntry getButton(String action) {
        return buttons.get(action);
    }

    public static class ButtonEntry {

        public final int buttonId;
        public final int joystickId;

        public ButtonEntry(final int buttonId, final int joystickId) {
            this.buttonId = buttonId;
            this.joystickId = joystickId;
        }
    }
}
