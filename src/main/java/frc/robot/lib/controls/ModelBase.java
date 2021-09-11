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

    public AxisEntry axis(final int joystickIndex, final int axisId) {
        return new AxisEntry(joystickIds[joystickIndex], axisId);
    }

    public static class AxisEntry {
        public final int joystickId;
        public final int axisId;

        public AxisEntry(final int joystickId, final int axisId) {
            this.joystickId = joystickId;
            this.axisId = axisId;
        }
    }
}
