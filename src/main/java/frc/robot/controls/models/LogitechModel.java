package frc.robot.controls.models;

import frc.robot.controls.ModelEntry;

public class LogitechModel {
    // #region Button definitions
    public static final ModelEntry A = new ModelEntry(1);
    public static final ModelEntry B = new ModelEntry(2);
    public static final ModelEntry X = new ModelEntry(3);
    public static final ModelEntry Y = new ModelEntry(4);

    public static final ModelEntry LEFT_BUMPER = new ModelEntry(5);
    public static final ModelEntry RIGHT_BUMPER = new ModelEntry(6);

    public static final ModelEntry BACK = new ModelEntry(7);
    public static final ModelEntry START = new ModelEntry(8);

    public static final ModelEntry LEFT_STICK_PUSH = new ModelEntry(9);
    public static final ModelEntry RIGHT_STICK_PUSH = new ModelEntry(10);
    // #endregion

    // #region Axis definitions
    public static final ModelEntry LEFT_STICK_X = new ModelEntry(0);
    public static final ModelEntry LEFT_STICK_Y = new ModelEntry(1);

    public static final ModelEntry LEFT_TRIGGER_HELD = new ModelEntry(2);
    public static final ModelEntry RIGHT_TRIGGER_HELD = new ModelEntry(3);

    public static final ModelEntry RIGHT_STICK_X = new ModelEntry(4);
    public static final ModelEntry RIGHT_STICK_Y = new ModelEntry(5);
    // #endregion
}
