package at.altin.it.academy.architecture.command.invoker;

import at.altin.it.academy.architecture.command.invoker.base.AbstractInvoker;
import at.altin.it.academy.architecture.command.operation.base.Operation;

/**
 * the Executor for the operation: Operation
 */
public  class OperationExecutor extends AbstractInvoker<Operation> {

    @Override
    public void executeOperation(Operation operation) {
        operation.execute();
    }
}
