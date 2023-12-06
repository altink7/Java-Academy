package at.altin.it.academy.architecture.command.operation;

import at.altin.it.academy.architecture.command.operation.base.AbstractOperation;
import at.altin.it.academy.architecture.command.receiver.OperationService;

/**
 * Delete Operation
 */
public class DeleteOperation extends AbstractOperation<OperationService> {
    public DeleteOperation(OperationService receiver) {
        super(receiver);
    }

    @Override
    protected void callOperation(OperationService receiver) {
        receiver.delete();
    }
}
