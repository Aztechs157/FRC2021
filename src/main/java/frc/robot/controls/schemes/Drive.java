package frc.robot.controls.schemes;

import static frc.robot.controls.models.LogitechModel.*;
import frc.robot.controls.models.ModelEntry;

public class Drive implements Scheme {
    public ModelEntry driveForward() {
        return A;
    }
}
