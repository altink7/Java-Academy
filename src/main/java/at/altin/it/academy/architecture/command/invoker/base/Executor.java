package at.altin.it.academy.architecture.command.invoker.base;

/**
 * Invoker
 * @param <T> the type of the operation
 */
@FunctionalInterface
public interface Executor<T> {
    void executeOperation(T operation);
}
