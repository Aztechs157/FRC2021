package frc.robot.lib.controls;

import java.util.HashMap;
import java.util.Map;

public class LayoutBase<ButtonKey, AxisKey> {

    public final String name;

    public LayoutBase(final String name) {
        this.name = name;
    }

    private final Map<ButtonKey, ButtonInput> buttons = new HashMap<>();

    public void assign(final ButtonKey action, final ButtonInput input) {
        buttons.put(action, input);
    }

    public ButtonInput getButton(final ButtonKey action) {
        return buttons.get(action);
    }

    private final Map<AxisKey, AxisInput> axes = new HashMap<>();

    public void assign(final AxisKey axis, final AxisInput input) {
        axes.put(axis, input);
    }

    public AxisInput getAxis(final AxisKey axis) {
        return axes.get(axis);
    }
}
