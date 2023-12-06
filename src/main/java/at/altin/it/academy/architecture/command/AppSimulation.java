package at.altin.it.academy.architecture.command;

import at.altin.it.academy.architecture.command.invoker.OperationExecutor;
import at.altin.it.academy.architecture.command.operation.DeleteOperation;
import at.altin.it.academy.architecture.command.operation.SaveOperation;
import at.altin.it.academy.architecture.command.receiver.OperationService;

import java.util.Scanner;

public class AppSimulation {
    private final static OperationExecutor executor = new OperationExecutor();
    private final static OperationService service = new OperationService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter operation name: (save, delete, 0 to exit)");
            String operationName = scanner.nextLine();

            if (operationName.equals("0")) {
                break;
            }

            executeOperation(operationName);
        } while (true);

        displayStatisticOfOperations();
        scanner.close();
    }

    private static void executeOperation(String operationName) {
        if (operationName.equals("save")) {
            executor.addOperation(new SaveOperation(service));
        } else if (operationName.equals("delete")) {
            executor.addOperation(new DeleteOperation(service));
        } else {
            System.out.println("Invalid operation name");
        }
    }

    private static void displayStatisticOfOperations() {
        System.out.println("Number of operations: " + executor.getOperations().size());
        System.out.println("Operations: ");
        executor.getOperations().forEach(operation -> System.out.println(operation.getClass().getSimpleName()));
        System.out.println("Last operation: " + executor.getOperations().get(executor.getOperations().size() - 1).getClass().getSimpleName());
        System.out.println("clearing operations ...");
        executor.clear();
    }
}