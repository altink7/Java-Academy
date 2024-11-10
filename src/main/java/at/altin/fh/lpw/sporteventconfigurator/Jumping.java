package at.altin.fh.lpw.sporteventconfigurator;

public class Jumping extends Event {
    private JumpTyp type;

    public Jumping(String name, JumpTyp type) {
        super(name);
        this.type = type;
    }

    public JumpTyp getType() {
        return type;
    }

    public void setType(JumpTyp type) {
        this.type = type;
    }

    @Override
    public String toString() {
        // High Jump Jumping Event
        return "%s %s Event".formatted(type.name(), getClass().getSimpleName());
    }
}
