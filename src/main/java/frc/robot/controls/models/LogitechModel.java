package frc.robot.controls.models;

import frc.robot.lib.controls.BooleanInput;
import frc.robot.lib.controls.ModelBase;

public class LogitechModel extends ModelBase {

    public LogitechModel(final int joystickId) {
        super(joystickId);
    }

    public final BooleanInput a = button(0, 1);
    public final BooleanInput b = button(0, 2);
    public final BooleanInput x = button(0, 3);
    public final BooleanInput y = button(0, 4);

    public final BooleanInput leftBumper = button(0, 5);
    public final BooleanInput rightBumper = button(0, 6);

    public final BooleanInput back = button(0, 7);
    public final BooleanInput start = button(0, 8);

    public final BooleanInput leftStickPress = button(0, 9);
    public final BooleanInput rightStickPress = button(0, 10);

    public final AxisEntry leftStickX = axis(0, 0);
    public final AxisEntry leftStickY = axis(0, 1);

    public final AxisEntry rightTriggerHeld = axis(0, 2);
    public final AxisEntry leftTriggerHeld = axis(0, 3);

    public final AxisEntry rightStickX = axis(0, 4);
    public final AxisEntry rightStickY = axis(0, 5);
}
