package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.Controller.ButtonKey;
import static frc.robot.controls.Controller.ButtonKey.*;
import frc.robot.controls.Controller.AxisKey;
import static frc.robot.lib.controls.ButtonInput.*;

public class Controller extends ControllerBase<ButtonKey, AxisKey> {

    public Controller() {
        add(new Layout("First") {
            {
                assign(PrintFoo, all(logitech.a, logitech.x));
                assign(PrintBar, all(logitech.b, logitech.y));
                assign(AxisKey.Foo, logitech.leftStickX);
            }
        });

        add(new Layout("Second") {
            {
                assign(PrintFoo, logitech.x);
                assign(PrintBar, logitech.y);
                assign(AxisKey.Foo, logitech.rightStickX);
            }
        });
    }

    private final LogitechModel logitech = new LogitechModel(0);

    public static enum ButtonKey {
        PrintFoo, PrintBar, Toggle
    }

    public static enum AxisKey {
        Foo
    }

    private static class Layout extends LayoutBase<ButtonKey, AxisKey> {
        public Layout(final String name) {
            super(name);
        }
    }
}
