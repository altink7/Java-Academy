package at.altin.it.academy.architecture.visitor;

// Visitor interface
interface AnimalVisitor {
    void visit(Lion lion);

    void visit(Monkey monkey);
}
