package frc.robot;

import frc.robot.controls.ControllerBase;
import frc.robot.controls.Layout;
import frc.robot.controls.models.LogitechModel;

public class Controller extends ControllerBase {

    public Controller() {
        addDefaultLayout("First", new Layout() {
            {
                assign("printFoo", LogitechModel.A.onJoystick(0));
                assign("printBar", LogitechModel.B.onJoystick(0));
                assign("toggle", LogitechModel.START.onJoystick(0));
            }
        });

        addLayout("Second", new Layout() {
            {
                assign("printFoo", LogitechModel.X.onJoystick(0));
                assign("printBar", LogitechModel.Y.onJoystick(0));
                assign("toggle", LogitechModel.START.onJoystick(0));
            }
        });
    }
}
