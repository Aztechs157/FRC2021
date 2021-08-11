package frc.robot;

import frc.robot.controls.ControllerBase;
import frc.robot.controls.Layout;
import frc.robot.controls.models.LogitechModel;

public class Controller extends ControllerBase {

    public Controller() {
        add(new Layout("First") {
            {
                selectJoystick(0);
                assign("printFoo", LogitechModel.A);
                assign("printBar", LogitechModel.B);
                assign("toggle", LogitechModel.START);
            }
        });

        add(new Layout("Second") {
            {
                selectJoystick(0);
                assign("printFoo", LogitechModel.X);
                assign("printBar", LogitechModel.Y);
                assign("toggle", LogitechModel.START);
            }
        });
    }
}
