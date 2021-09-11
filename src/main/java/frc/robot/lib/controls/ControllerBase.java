package frc.robot.lib.controls;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.button.Button;

public class ControllerBase<ButtonKey, AxisKey> {

    private SendableChooser<LayoutBase<ButtonKey, AxisKey>> layouts = new SendableChooser<>();
    private boolean isEmpty = true;

    {
        Shuffleboard.getTab("Config").add("Layout", layouts);
    }

    public void add(final LayoutBase<ButtonKey, AxisKey> layout) {
        if (isEmpty) {
            isEmpty = false;
            layouts.setDefaultOption(layout.name, layout);
        } else {
            layouts.addOption(layout.name, layout);
        }
    }

    public Button button(final ButtonKey action) {
        return new Button(() -> getButton(action));
    }

    public boolean getButton(final ButtonKey action) {
        return layouts.getSelected().getButton(action).get();
    }

    public double getAxis(final AxisKey axis) {
        return layouts.getSelected().getAxis(axis).get();
    }
}
