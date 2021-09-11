package frc.robot.lib.controls;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.button.Button;

public class ControllerBase<ButtonKey, AxisKey> implements Sendable {

    private SendableChooser<LayoutBase<ButtonKey, AxisKey>> layouts = new SendableChooser<>();

    @Override
    public void initSendable(final SendableBuilder builder) {
        layouts.initSendable(builder);
    }

    public void addDefault(final LayoutBase<ButtonKey, AxisKey> layout) {
        layouts.setDefaultOption(layout.name, layout);
    }

    public void add(final LayoutBase<ButtonKey, AxisKey> layout) {
        layouts.addOption(layout.name, layout);
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
