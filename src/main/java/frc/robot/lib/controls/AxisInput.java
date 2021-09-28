package frc.robot.lib.controls;

/**
 * Interface for getting input from a axis. This class has methods and static
 * methods to modify and compose {@link AxisInput}s into a new
 * {@link AxisInput}.
 */
@FunctionalInterface
public interface AxisInput {

    /**
     * Get an input from this {@link AxisInput}
     *
     * @return The number representing the input
     */
    public double get();

    /**
     * Inverts the input by flipping the number's sign
     *
     * @return A new inverted input
     */
    public default AxisInput inverted() {
        return () -> -get();
    }
}
