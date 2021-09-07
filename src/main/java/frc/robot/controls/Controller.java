package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.Controller.Action;
import static frc.robot.controls.Controller.Action.*;

public class Controller extends ControllerBase<Action> {

    public Controller() {
        add(new Layout("First") {
            {
                assign(PrintFoo, logitech.a);
                assign(PrintBar, logitech.b);
                assign(Toggle, logitech.start);
            }
        });

        add(new Layout("Second") {
            {
                assign(PrintFoo, logitech.x);
                assign(PrintBar, logitech.y);
                assign(Toggle, logitech.start);
            }
        });
    }

    private final LogitechModel logitech = new LogitechModel(0);

    public static enum Action {
        PrintFoo, PrintBar, Toggle
    }

    private static class Layout extends LayoutBase<Action> {
        public Layout(String name) {
            super(name);
        }
    }
}
