package at.altin.it.academy.architecture.builder.builder;

import at.altin.it.academy.architecture.builder.data.Element;

/**
 * A simple builder class
 */
public class ElementBuilder {
private String name;
    private String type;
    private String value;

    public ElementBuilder() {
    }

    public ElementBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ElementBuilder type(String type) {
        this.type = type;
        return this;
    }

    public ElementBuilder value(String value) {
        this.value = value;
        return this;
    }

    public Element build() {
        return new Element(name, type, value);
    }
}
