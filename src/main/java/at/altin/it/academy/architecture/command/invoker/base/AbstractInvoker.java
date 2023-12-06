package at.altin.it.academy.architecture.command.invoker.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 * This class is responsible for invoking the operations
 */
public abstract class AbstractInvoker<T> implements Executor<T>{
    private final List<T> operations = new ArrayList<>();

    protected void executeConsumer(T operation) {
        executeOperation(operation);
    }

    public void addOperation(T operation) {
        this.operations.add(operation);
        executeConsumer(operation);
    }

    public void executeAll() {
        for (T operation : operations) {
            executeConsumer(operation);
        }
    }

    public List<T> getOperations() {
        return this.operations;
    }

    public void removeOperations(List<T> operations) {
        this.operations.removeAll(operations);
    }

    public void clear() {
        this.operations.clear();
    }

    public void removeOperation(int index) {
        this.operations.remove(index);
    }
}
