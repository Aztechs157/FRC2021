package frc.robot.lib.controls;

@FunctionalInterface
public interface AxisInput {
    public double get();

    public default AxisInput inverted() {
        return () -> -get();
    }
}
