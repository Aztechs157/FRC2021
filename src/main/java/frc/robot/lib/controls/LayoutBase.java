package frc.robot.lib.controls;

import java.util.HashMap;
import java.util.Map;

public class LayoutBase<Action, Axis> {

    public final String name;

    public LayoutBase(final String name) {
        this.name = name;
    }

    private final Map<Action, ButtonInput> buttons = new HashMap<>();

    public void assign(final Action action, final ButtonInput input) {
        buttons.put(action, input);
    }

    public ButtonInput getButton(final Action action) {
        return buttons.get(action);
    }

    private final Map<Axis, AxisInput> axies = new HashMap<>();

    public void assign(final Axis axis, final AxisInput input) {
        axies.put(axis, input);
    }

    public AxisInput getAxis(final Axis axis) {
        return axies.get(axis);
    }
}
