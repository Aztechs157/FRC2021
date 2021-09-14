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

    public Button button(final ButtonKey buttonKey) {
        return new Button(() -> getButton(buttonKey));
    }

    public boolean getButton(final ButtonKey buttonKey) {
        var layout = layouts.getSelected();
        return layout == null ? false : layout.getButton(buttonKey).get();
    }

    public double getAxis(final AxisKey axisKey) {
        var layout = layouts.getSelected();
        return layout == null ? 0 : layout.getAxis(axisKey).get();
    }
}
