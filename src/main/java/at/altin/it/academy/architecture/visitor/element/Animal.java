package at.altin.it.academy.architecture.visitor.element;


import at.altin.it.academy.architecture.visitor.visitor.AnimalVisitor;

/**
 * Element interface
 * This interface is implemented by all concrete elements
 * It declares the accept operation, which should take the visitor as an argument
 */
public interface Animal {

    /**
     * Accept operation
     * @param visitor the visitor
     */
    void accept(AnimalVisitor visitor);
}
