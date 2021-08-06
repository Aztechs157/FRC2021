package frc.robot.controls.schemes;

import frc.robot.controls.SchemeEntry;
import frc.robot.controls.models.LogitechModel;

public class First implements Scheme {

    public SchemeEntry printFoo() {
        return LogitechModel.A.onJoystick(0);
    }

    public SchemeEntry printBar() {
        return LogitechModel.B.onJoystick(0);
    }
}
