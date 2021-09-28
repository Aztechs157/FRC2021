package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.DriveController.ButtonKey;
import frc.robot.controls.DriveController.AxisKey;

public class DriveController extends ControllerBase<ButtonKey, AxisKey> {

    public DriveController() {

        var regularLayout = new Layout("Regular");
        var logitech = new LogitechModel(0);

        regularLayout.assign(AxisKey.LeftFoward, logitech.leftStickY);
        regularLayout.assign(AxisKey.RightFoward, logitech.rightStickY);

        addDefault(regularLayout);
    }

    public static enum ButtonKey {

    }

    public static enum AxisKey {
        LeftFoward, RightFoward
    }

    private static class Layout extends LayoutBase<ButtonKey, AxisKey> {
        public Layout(final String name) {
            super(name);
        }
    }
}
