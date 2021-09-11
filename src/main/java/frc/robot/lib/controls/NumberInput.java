package frc.robot.lib.controls;

@FunctionalInterface
public interface NumberInput {
    public double get(final InputContext context);
}
