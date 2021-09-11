package frc.robot.lib.controls;

@FunctionalInterface
public interface AxisInput {
    public double get(final InputContext context);
}
