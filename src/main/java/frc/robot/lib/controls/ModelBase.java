package frc.robot.lib.controls;

public class ModelBase {

    private final int[] joystickIds;

    public ModelBase(final int... joystickIds) {
        this.joystickIds = joystickIds;
    }

    public ButtonEntry button(final int joystickIndex, final int buttonId) {
        return new ButtonEntry(joystickIds[joystickIndex], buttonId);
    }

    public static class ButtonEntry {
        public final int joystickId;
        public final int buttonId;

        public ButtonEntry(final int joystickId, final int buttonId) {
            this.joystickId = joystickId;
            this.buttonId = buttonId;
        }
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
