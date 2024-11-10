package at.altin.fh.lpw.sporteventconfigurator;

public class Running extends Event{
    private int meters;

    public Running(String name, int meters) {
        super(name);

        // if meters smaller than 50 then take '50 meters' as default
        this.meters = Math.max(meters, 50);
    }

    public int getMeters() {
        return meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
    }

    @Override
    public String toString() {
        // 4200 Meters Running
        return "%d Meters %s".formatted(meters, getClass().getSimpleName());
    }

}
