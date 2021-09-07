package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.Controller.Action;
import static frc.robot.controls.Controller.Action.*;
import frc.robot.controls.Controller.Axis;

public class Controller extends ControllerBase<Action, Axis> {

    public Controller() {
        add(new Layout("First") {
            {
                assign(PrintFoo, logitech.a);
                assign(PrintBar, logitech.b);
                assign(Toggle, logitech.start);
                assign(Axis.Foo, logitech.leftStickX);
            }
        });

        add(new Layout("Second") {
            {
                assign(PrintFoo, logitech.x);
                assign(PrintBar, logitech.y);
                assign(Toggle, logitech.start);
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
