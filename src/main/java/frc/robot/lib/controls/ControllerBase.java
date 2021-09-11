package frc.robot.lib.controls;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.button.Button;

public class ControllerBase<Action, Axis> {
    private final InputContext inputContext = new InputContext();

    private SendableChooser<LayoutBase<Action, Axis>> layouts = new SendableChooser<>();
    private boolean isEmpty = true;

    {
        Shuffleboard.getTab("Config").add("Layout", layouts);
    }

    public void add(final LayoutBase<Action, Axis> layout) {
        if (isEmpty) {
            isEmpty = false;
            layouts.setDefaultOption(layout.name, layout);
        } else {
            layouts.addOption(layout.name, layout);
        }
    }

    public Button on(final Action action) {
        return new Button(() -> getButton(action));
    }

    public boolean getButton(final Action action) {
        return layouts.getSelected().getButton(action).get(inputContext);
    }

    public double getAxis(final Axis axis) {
        return layouts.getSelected().getAxis(axis).get(inputContext);
    }
}
