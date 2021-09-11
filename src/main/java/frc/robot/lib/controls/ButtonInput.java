package frc.robot.lib.controls;

@FunctionalInterface
public interface ButtonInput {

    public boolean get();

    public default ButtonInput and(final ButtonInput other) {
        return () -> this.get() && other.get();
    }

    public default ButtonInput or(final ButtonInput other) {
        return () -> this.get() || other.get();
    }

    public static ButtonInput always(final boolean value) {
        return () -> value;
    }
}
