package at.altin.it.academy.architecture.visitor;


// Element interface
interface Animal {
    void accept(AnimalVisitor visitor);
}
