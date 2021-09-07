package frc.robot.controls;

public class ModelBase {

    private final int joystickId;

    public ModelBase(final int joystickId) {
        this.joystickId = joystickId;
    }

    public ButtonEntry button(final int buttonId) {
        return new ButtonEntry(joystickId, buttonId);
    }

    public static class ButtonEntry {
        public final int joystickId;
        public final int buttonId;

        public ButtonEntry(final int joystickId, final int buttonId) {
            this.joystickId = joystickId;
            this.buttonId = buttonId;
        }
    }
}
