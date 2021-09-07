package frc.robot.lib.controls;

import java.util.HashMap;
import java.util.Map;

import frc.robot.lib.controls.ModelBase.ButtonEntry;

public class LayoutBase<Action> {

    public String name;

    public LayoutBase(final String name) {
        this.name = name;
    }

    private final Map<Action, ButtonEntry> buttons = new HashMap<>();

    public void assign(Action action, ButtonEntry entry) {
        buttons.put(action, entry);
    }

    public ButtonEntry getButton(Action action) {
        return buttons.get(action);
    }
}