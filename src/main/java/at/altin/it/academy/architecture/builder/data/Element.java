package at.altin.it.academy.architecture.builder.data;

/**
 * Just a simple data class
 */
public class Element {
    private String name;
    private String type;
    private String value;

    public Element() {
    }

    public Element(String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
