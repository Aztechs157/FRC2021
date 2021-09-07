package frc.robot.lib.controls;

import java.util.HashMap;
import java.util.Map;

import frc.robot.lib.controls.ModelBase.ButtonEntry;
import frc.robot.lib.controls.ModelBase.AxisEntry;

public class LayoutBase<Action, Axis> {

    public final String name;

    public LayoutBase(final String name) {
        this.name = name;
    }

    private final Map<Action, ButtonEntry> buttons = new HashMap<>();

    public void assign(final Action action, final ButtonEntry entry) {
        buttons.put(action, entry);
    }

    public ButtonEntry getButton(final Action action) {
        return buttons.get(action);
    }

    private final Map<Axis, AxisEntry> axies = new HashMap<>();

    public void assign(final Axis axis, final AxisEntry entry) {
        axies.put(axis, entry);
    }

    public AxisEntry getAxis(final Axis axis) {
        return axies.get(axis);
    }
}
