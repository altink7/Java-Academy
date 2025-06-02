package at.altin.fh.eww2025.sporteventconfigurator;

public class Running extends Event {
    private int meters;

    public Running(String name, int meters) {
        super(name);
        this.meters = meters;
    }

    public int getMeters() {
        return meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
    }
}
