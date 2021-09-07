package frc.robot;

import frc.robot.controls.ControllerBase;
import frc.robot.controls.LayoutBase;
import frc.robot.controls.models.LogitechModel;
import static frc.robot.Controller.Action.*;

public class Controller extends ControllerBase<Controller.Action> {

    private static class Layout extends LayoutBase<Controller.Action> {
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
