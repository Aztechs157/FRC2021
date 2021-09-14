package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.FlightModel;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.Controller.ButtonKey;
import frc.robot.controls.Controller.AxisKey;

public class Controller extends ControllerBase<ButtonKey, AxisKey> {

    public Controller() {
        addDefault(new Layout("Game") {
            {
                var model = new LogitechModel(0);

                assign(AxisKey.LeftFoward, model.leftStickY);
                assign(AxisKey.RightFoward, model.rightStickY);
            }
        });

        add(new Layout("Plane") {
            {
                var left = new FlightModel(1);
                var right = new FlightModel(2);

                assign(AxisKey.LeftFoward, left.stickY);
                assign(AxisKey.RightFoward, right.stickY);
            }
        });
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
