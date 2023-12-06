package at.altin.it.academy.architecture.command.operation;

import at.altin.it.academy.architecture.command.operation.base.AbstractOperation;
import at.altin.it.academy.architecture.command.receiver.OperationService;

/**
 * Save Operation
 */
public class SaveOperation extends AbstractOperation<OperationService> {
    public SaveOperation(OperationService receiver) {
        super(receiver);
    }

    @Override
    protected void callOperation(OperationService receiver) {
        receiver.save();
    }
}
