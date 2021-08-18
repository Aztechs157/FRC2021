package frc.robot.controls;

import java.util.HashMap;
import java.util.Map;

public class LayoutBase<Action> {
    public final String name;

    public LayoutBase(final String name) {
        this.name = name;
    }

    private int currentJoystick;

    public void selectJoystick(final int joystickId) {
        currentJoystick = joystickId;
    }

    private final Map<Action, ButtonEntry> buttons = new HashMap<>();

    public void assign(Action action, ButtonId buttonId) {
        buttons.put(action, new ButtonEntry(buttonId.buttonId, currentJoystick));
    }

    public ButtonEntry getButton(Action action) {
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
