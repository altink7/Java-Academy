package at.altin.it.academy.architecture.visitor.visitor;

import at.altin.it.academy.architecture.visitor.element.Lion;
import at.altin.it.academy.architecture.visitor.element.Monkey;


/**
 * Concrete visitor implementing the operations for each concrete element
 */
public class ZooKeeper implements AnimalVisitor {

    @Override
    public void visit(Lion lion) {
        System.out.println("ZooKeeper is observing the lion: " + lion.roar());
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("ZooKeeper is watching the monkey: " + monkey.swing());
    }
}
