package at.altin.it.academy.architecture.visitor;

public class ZooSimulation {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal monkey = new Monkey();

        AnimalVisitor zooKeeper = new ZooKeeper();

        // Animals accept the visitor
        lion.accept(zooKeeper);
        monkey.accept(zooKeeper);
    }
}
