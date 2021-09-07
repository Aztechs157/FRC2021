package frc.robot.controls;

import java.util.HashMap;
import java.util.Map;

import frc.robot.controls.ModelBase.ButtonEntry;

public class LayoutBase<Action> {

    private final Map<Action, ButtonEntry> buttons = new HashMap<>();

    public void assign(Action action, ButtonEntry entry) {
        buttons.put(action, entry);
    }

    public ButtonEntry getButton(Action action) {
        return buttons.get(action);
    }
}
