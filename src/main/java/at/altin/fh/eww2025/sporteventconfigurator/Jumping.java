package at.altin.fh.eww2025.sporteventconfigurator;

public class Jumping extends Event {
    private JumpType type;

    public Jumping(String name, JumpType type) {
        super(name);
        this.type = type;
    }

    public JumpType getType() {
        return type;
    }

    public void setType(JumpType type) {
        this.type = type;
    }
}
