package frc.robot.lib.controls;

@FunctionalInterface
public interface ButtonInput {

    public boolean get();

    public static ButtonInput all(final ButtonInput... inputs) {
        return () -> {
            for (final var input : inputs)
                if (input.get() == false)
                    return false;

            return true;
        };
    }

    public static ButtonInput any(final ButtonInput... inputs) {
        return () -> {
            for (final var input : inputs)
                if (input.get())
                    return true;

            return false;
        };
    }
}
