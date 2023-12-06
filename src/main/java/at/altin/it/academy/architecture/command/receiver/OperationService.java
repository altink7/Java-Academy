package at.altin.it.academy.architecture.command.receiver;

/**
 * Receiver, can also be a wrapper around the service implementation
 * This class contains the business logic
 */
public class OperationService {
    public void delete() {
        System.out.println("deleting ...");
    }

    public void save() {
        System.out.println("saving ...");
    }
}
