package at.altin.it.academy.architecture.visitor.element;

import at.altin.it.academy.architecture.visitor.visitor.AnimalVisitor;

public class Monkey implements Animal {

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public String swing() {
        return "Swinging from tree to tree.";
    }
}