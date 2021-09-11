package frc.robot.lib.controls;

import edu.wpi.first.wpilibj.DriverStation;

public class ModelBase {

    private final int[] joystickIds;

    public ModelBase(final int... joystickIds) {
        this.joystickIds = joystickIds;
    }

    private static DriverStation driverStation = DriverStation.getInstance();

    public ButtonInput button(final int joystickIndex, final int buttonId) {
        return () -> driverStation.getStickButton(joystickIds[joystickIndex], buttonId);
    }

    public AxisInput axis(final int joystickIndex, final int axisId) {
        return () -> driverStation.getStickAxis(joystickIds[joystickIndex], axisId);
    }
}
