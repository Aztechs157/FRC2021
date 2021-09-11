package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.Controller.Action;
import static frc.robot.controls.Controller.Action.*;
import frc.robot.controls.Controller.Axis;
import static frc.robot.lib.controls.BooleanInput.*;

public class Controller extends ControllerBase<Action, Axis> {

    public Controller() {
        add(new Layout("First") {
            {
                assign(PrintFoo, all(logitech.a, logitech.x));
                assign(PrintBar, all(logitech.b, logitech.y));
                assign(Axis.Foo, logitech.leftStickX);
            }
        });

        add(new Layout("Second") {
            {
                assign(PrintFoo, logitech.x);
                assign(PrintBar, logitech.y);
                assign(Axis.Foo, logitech.rightStickX);
            }
        });
    }

    private final LogitechModel logitech = new LogitechModel(0);

    public static enum Action {
        PrintFoo, PrintBar, Toggle
    }

    public static enum Axis {
        Foo
    }

    private static class Layout extends LayoutBase<Action, Axis> {
        public Layout(final String name) {
            super(name);
        }
    }
}
