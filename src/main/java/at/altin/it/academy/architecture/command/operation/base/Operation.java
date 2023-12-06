package at.altin.it.academy.architecture.command.operation.base;

/**
 * Operation interface
 * This interface declares a method for executing an operation
 */
@FunctionalInterface
public interface Operation {

    void execute();
}
