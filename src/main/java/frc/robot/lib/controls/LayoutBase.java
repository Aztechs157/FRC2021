package frc.robot.lib.controls;

import java.util.HashMap;
import java.util.Map;

public class LayoutBase<Action, Axis> {

    public final String name;

    public LayoutBase(final String name) {
        this.name = name;
    }

    private final Map<Action, BooleanInput> buttons = new HashMap<>();

    public void assign(final Action action, final BooleanInput input) {
        buttons.put(action, input);
    }

    public BooleanInput getButton(final Action action) {
        return buttons.get(action);
    }

    private final Map<Axis, NumberInput> axies = new HashMap<>();

    public void assign(final Axis axis, final NumberInput input) {
        axies.put(axis, input);
    }

    public NumberInput getAxis(final Axis axis) {
        return axies.get(axis);
    }
}
