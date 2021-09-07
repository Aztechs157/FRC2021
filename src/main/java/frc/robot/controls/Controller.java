package frc.robot.controls;

import frc.robot.lib.controls.ControllerBase;
import frc.robot.lib.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import frc.robot.controls.Controller.Action;
import static frc.robot.controls.Controller.Action.*;

public class Controller extends ControllerBase<Action> {

    private static class Layout extends LayoutBase<Action> {
    }

    public static enum Action {
        PrintFoo, PrintBar, Toggle
    }

    private final LogitechModel logitech = new LogitechModel(0);

    public Controller() {
        add("First", new Layout() {
            {
                assign(PrintFoo, logitech.a);
                assign(PrintBar, logitech.b);
                assign(Toggle, logitech.start);
            }
        });

        add("Second", new Layout() {
            {
                assign(PrintFoo, logitech.x);
                assign(PrintBar, logitech.y);
                assign(Toggle, logitech.start);
            }
        });
    }
}
