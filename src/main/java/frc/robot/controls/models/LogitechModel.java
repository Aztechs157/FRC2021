package frc.robot.controls.models;

import frc.robot.lib.controls.ButtonInput;
import frc.robot.lib.controls.ModelBase;
import frc.robot.lib.controls.AxisInput;

public class LogitechModel extends ModelBase {

    public LogitechModel(final int joystickId) {
        super(joystickId);
    }

    public final ButtonInput a = button(0, 1);
    public final ButtonInput b = button(0, 2);
    public final ButtonInput x = button(0, 3);
    public final ButtonInput y = button(0, 4);

    public final ButtonInput leftBumper = button(0, 5);
    public final ButtonInput rightBumper = button(0, 6);

    public final ButtonInput back = button(0, 7);
    public final ButtonInput start = button(0, 8);

    public final ButtonInput leftStickPress = button(0, 9);
    public final ButtonInput rightStickPress = button(0, 10);

    public final AxisInput leftStickX = axis(0, 0);
    public final AxisInput leftStickY = axis(0, 1);

    public final AxisInput rightTriggerHeld = axis(0, 2);
    public final AxisInput leftTriggerHeld = axis(0, 3);

    public final AxisInput rightStickX = axis(0, 4);
    public final AxisInput rightStickY = axis(0, 5);
}
