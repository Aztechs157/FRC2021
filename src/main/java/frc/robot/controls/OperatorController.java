package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.OperatorController.ButtonKey;
import static frc.robot.controls.OperatorController.ButtonKey.*;
import frc.robot.controls.OperatorController.AxisKey;

public class OperatorController extends ControllerBase<ButtonKey, AxisKey> {

    public OperatorController() {

        var debugLayout = new Layout("Debug");
        var logitech = new LogitechModel(0);

        debugLayout.assign(PickupBall, logitech.rightBumper);
        debugLayout.assign(TestUptake, logitech.leftBumper);
        debugLayout.assign(DebugAimer, logitech.a);
        debugLayout.assign(RaiseTargetSpeed, logitech.b);
        debugLayout.assign(LowerTargetSpeed, logitech.x);

        debugLayout.assign(AxisKey.Turret, logitech.leftStickX);

        addDefault(debugLayout);
    }

    public static enum ButtonKey {
        PickupBall, TestUptake, DebugAimer, RaiseTargetSpeed, LowerTargetSpeed,
    }

    public static enum AxisKey {
        Turret
    }

    private static class Layout extends LayoutBase<ButtonKey, AxisKey> {
        public Layout(final String name) {
            super(name);
        }
    }
}
