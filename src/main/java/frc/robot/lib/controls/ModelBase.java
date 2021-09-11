package frc.robot.lib.controls;

public class ModelBase {

    private final int[] joystickIds;

    public ModelBase(final int... joystickIds) {
        this.joystickIds = joystickIds;
    }

    public BooleanInput button(final int joystickIndex, final int buttonId) {
        return (final InputContext context) -> {
            return context.getJoystick(joystickIds[joystickIndex]).getRawButton(buttonId);
        };
    }

    public NumberInput axis(final int joystickIndex, final int axisId) {
        return (final InputContext context) -> {
            return context.getJoystick(joystickIds[joystickIndex]).getRawAxis(axisId);
        };
    }
}
