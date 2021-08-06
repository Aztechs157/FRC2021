package frc.robot.controls;

public class ModelEntry {
    public final int entryId;

    public ModelEntry(final int entryId) {
        this.entryId = entryId;
    }

    public SchemeEntry onJoystick(final int joystickId) {
        return new SchemeEntry(entryId, joystickId);
    }
}
