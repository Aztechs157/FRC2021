package frc.robot.lib.controls;

@FunctionalInterface
public interface ButtonInput {

    public boolean get(final InputContext context);

    public static ButtonInput all(final ButtonInput... inputs) {
        return (final InputContext context) -> {
            for (final var input : inputs)
                if (input.get(context) == false)
                    return false;

            return true;
        };
    }

    public static ButtonInput any(final ButtonInput... inputs) {
        return (final InputContext context) -> {
            for (final var input : inputs)
                if (input.get(context))
                    return true;

            return false;
        };
    }
}
