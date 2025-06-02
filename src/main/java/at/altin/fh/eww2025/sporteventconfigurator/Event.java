package at.altin.fh.eww2025.sporteventconfigurator;

public abstract class Event {
    protected String name;

    protected Event(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
