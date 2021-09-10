package frc.robot.controls.models;

import frc.robot.lib.controls.ModelBase;

public class LogitechModel extends ModelBase {

    public LogitechModel(final int joystickId) {
        super(joystickId);
    }

    public final ButtonEntry a = button(0, 1);
    public final ButtonEntry b = button(0, 2);
    public final ButtonEntry x = button(0, 3);
    public final ButtonEntry y = button(0, 4);

    public final ButtonEntry leftBumper = button(0, 5);
    public final ButtonEntry rightBumper = button(0, 6);

    public final ButtonEntry back = button(0, 7);
    public final ButtonEntry start = button(0, 8);

    public final ButtonEntry leftStickPress = button(0, 9);
    public final ButtonEntry rightStickPress = button(0, 10);

    public final AxisEntry leftStickX = axis(0, 0);
    public final AxisEntry leftStickY = axis(0, 1);

    public final AxisEntry rightTriggerHeld = axis(0, 2);
    public final AxisEntry leftTriggerHeld = axis(0, 3);

    public final AxisEntry rightStickX = axis(0, 4);
    public final AxisEntry rightStickY = axis(0, 5);
}
