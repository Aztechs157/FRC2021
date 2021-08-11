package frc.robot.controls;

public class ButtonId {
    public final int buttonId;

    public ButtonId(final int entryId) {
        this.buttonId = entryId;
    }

    public ButtonJoystickId onJoystick(final int joystickId) {
        return new ButtonJoystickId(buttonId, joystickId);
    }
}
