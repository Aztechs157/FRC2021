package frc.robot.controls;

public class SchemeEntry {
    public final int entryId;
    public final int joystickId;

    public SchemeEntry(final int joystickId, final int entryId) {
        this.joystickId = joystickId;
        this.entryId = entryId;
    }
}
