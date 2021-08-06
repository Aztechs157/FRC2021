package frc.robot.controls.schemes;

import frc.robot.controls.SchemeEntry;
import frc.robot.controls.models.LogitechModel;

public class Second implements Scheme {
    public SchemeEntry printFoo() {
        return LogitechModel.X.onJoystick(0);
    }

    public SchemeEntry printBar() {
        return LogitechModel.Y.onJoystick(0);
    }
}
