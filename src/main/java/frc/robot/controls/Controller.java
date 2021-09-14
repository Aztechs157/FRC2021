package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.FlightModel;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.Controller.ButtonKey;
import frc.robot.controls.Controller.AxisKey;

public class Controller extends ControllerBase<ButtonKey, AxisKey> {

    public Controller() {

        var gameLayout = new Layout("Game");
        var logitech = new LogitechModel(0);

        gameLayout.assign(AxisKey.LeftFoward, logitech.leftStickY);
        gameLayout.assign(AxisKey.RightFoward, logitech.rightStickY);

        addDefault(gameLayout);

        var planeLayout = new Layout("Plane");
        var leftModel = new FlightModel(1);
        var rightModel = new FlightModel(2);

        planeLayout.assign(AxisKey.LeftFoward, leftModel.stickY);
        planeLayout.assign(AxisKey.RightFoward, rightModel.stickY);

        add(planeLayout);
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
