package frc.robot.lib.controls;

@FunctionalInterface
public interface AxisInput {
    public double get();

    public static AxisInput always(final double value) {
        return () -> value;
    }
}
