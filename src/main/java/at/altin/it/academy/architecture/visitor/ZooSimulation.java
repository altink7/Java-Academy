package at.altin.it.academy.architecture.visitor;

import at.altin.it.academy.architecture.visitor.element.Animal;
import at.altin.it.academy.architecture.visitor.element.Lion;
import at.altin.it.academy.architecture.visitor.element.Monkey;
import at.altin.it.academy.architecture.visitor.visitor.AnimalVisitor;
import at.altin.it.academy.architecture.visitor.visitor.ZooKeeper;

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
