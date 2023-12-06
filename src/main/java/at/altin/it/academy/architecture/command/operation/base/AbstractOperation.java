package at.altin.it.academy.architecture.command.operation.base;

/**
 * Abstract Operation, which implements the Operation interface
 * @see Operation
 * @param <T> the type of the receiver
 */
public abstract class AbstractOperation <T> implements Operation {
    protected  final T receiver;

    protected abstract void callOperation(T receiver);

    public AbstractOperation(T receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.printf("Executing operation [%s] \n", this.getClass().getSimpleName());
        callOperation(receiver);
    }
}
