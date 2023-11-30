package at.altin.it.academy.architecture.visitor;

class Monkey implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    String swing() {
        return "Swinging from tree to tree.";
    }
}