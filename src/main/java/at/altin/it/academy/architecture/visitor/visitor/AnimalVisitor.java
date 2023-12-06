package at.altin.it.academy.architecture.visitor.visitor;

import at.altin.it.academy.architecture.visitor.element.Lion;
import at.altin.it.academy.architecture.visitor.element.Monkey;

/**
 * Visitor interface
 * This interface declares a visit operation for each concrete element in the object structure
 */
public interface AnimalVisitor {
    void visit(Lion lion);

    void visit(Monkey monkey);
}
