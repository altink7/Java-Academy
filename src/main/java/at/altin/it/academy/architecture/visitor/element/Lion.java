package at.altin.it.academy.architecture.visitor.element;

import at.altin.it.academy.architecture.visitor.visitor.AnimalVisitor;

public class Lion implements Animal {

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public String roar() {
        return "Roar!";
    }
}