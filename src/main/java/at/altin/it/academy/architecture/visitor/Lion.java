package at.altin.it.academy.architecture.visitor;

class Lion implements Animal {

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    String roar() {
        return "Roar!";
    }
}