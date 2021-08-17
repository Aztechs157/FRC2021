package frc.robot;

import frc.robot.controls.ControllerBase;
import frc.robot.controls.Layout;
import frc.robot.controls.models.LogitechModel;
import static frc.robot.Controller.Action.*;

public class Controller extends ControllerBase {

    public static enum Action {
        PrintFoo, PrintBar, Toggle
    }

    public Controller() {
        add(new Layout("First") {
            {
                selectJoystick(0);
                assign(PrintFoo, LogitechModel.A);
                assign(PrintBar, LogitechModel.B);
                assign(Toggle, LogitechModel.START);
            }
        });

        add(new Layout("Second") {
            {
                selectJoystick(0);
                assign(PrintFoo, LogitechModel.X);
                assign(PrintBar, LogitechModel.Y);
                assign(Toggle, LogitechModel.START);
            }
        });
    }
}
