package frc.robot.lib.controls;

@FunctionalInterface
public interface BooleanInput {

    public boolean get(final InputContext context);

    public static BooleanInput all(final BooleanInput... inputs) {
        return (final InputContext context) -> {
            for (final var input : inputs)
                if (input.get(context) == false)
                    return false;

            return true;
        };
    }

    public static BooleanInput any(final BooleanInput... inputs) {
        return (final InputContext context) -> {
            for (final var input : inputs)
                if (input.get(context))
                    return true;

            return false;
        };
    }
}
