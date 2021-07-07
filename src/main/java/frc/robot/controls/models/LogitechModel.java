package frc.robot.controls.models;

public class LogitechModel {
    // #region Button definitions
    public static final ModelEntry A = new ModelEntry(0, 1);
    public static final ModelEntry B = new ModelEntry(0, 2);
    public static final ModelEntry X = new ModelEntry(0, 3);
    public static final ModelEntry Y = new ModelEntry(0, 4);

    public static final ModelEntry LEFT_BUMPER = new ModelEntry(0, 5);
    public static final ModelEntry RIGHT_BUMPER = new ModelEntry(0, 6);

    public static final ModelEntry BACK = new ModelEntry(0, 7);
    public static final ModelEntry START = new ModelEntry(0, 8);

    public static final ModelEntry LEFT_STICK_PUSH = new ModelEntry(0, 9);
    public static final ModelEntry RIGHT_STICK_PUSH = new ModelEntry(0, 10);
    // #endregion

    // #region Axis definitions
    public static final ModelEntry LEFT_STICK_X = new ModelEntry(0, 0);
    public static final ModelEntry LEFT_STICK_Y = new ModelEntry(0, 1);

    public static final ModelEntry LEFT_TRIGGER_HELD = new ModelEntry(0, 2);
    public static final ModelEntry RIGHT_TRIGGER_HELD = new ModelEntry(0, 3);

    public static final ModelEntry RIGHT_STICK_X = new ModelEntry(0, 4);
    public static final ModelEntry RIGHT_STICK_Y = new ModelEntry(0, 5);
    // #endregion
}
