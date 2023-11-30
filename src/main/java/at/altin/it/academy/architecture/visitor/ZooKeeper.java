package at.altin.it.academy.architecture.visitor;

// Concrete visitor implementing the operations for each concrete element
class ZooKeeper implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("ZooKeeper is observing the lion: " + lion.roar());
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("ZooKeeper is watching the monkey: " + monkey.swing());
    }
}
