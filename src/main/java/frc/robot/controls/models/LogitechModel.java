package frc.robot.controls.models;

import frc.robot.controls.ModelBase;

public class LogitechModel extends ModelBase {
    public LogitechModel(final int joystickId) {
        super(joystickId);
    }

    public final ButtonEntry a = button(1);
    public final ButtonEntry b = button(2);
    public final ButtonEntry x = button(3);
    public final ButtonEntry y = button(4);

    public final ButtonEntry leftBumper = button(5);
    public final ButtonEntry rightBumper = button(6);

    public final ButtonEntry back = button(7);
    public final ButtonEntry start = button(8);

    public final ButtonEntry leftStickPress = button(9);
    public final ButtonEntry rightStickPress = button(10);
}
