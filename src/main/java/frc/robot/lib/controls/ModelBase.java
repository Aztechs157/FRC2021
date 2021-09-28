package frc.robot.lib.controls;

import edu.wpi.first.wpilibj.DriverStation;

public class ModelBase {

    private final int joystickId;

    public ModelBase(final int joystickId) {
        this.joystickId = joystickId;
    }

    private static DriverStation driverStation = DriverStation.getInstance();

    public ButtonInput button(final int buttonId) {
        return () -> driverStation.getStickButton(joystickId, buttonId);
    }

    public AxisInput axis(final int axisId) {
        return () -> driverStation.getStickAxis(joystickId, axisId);
    }
}
