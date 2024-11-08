package at.altin.fh.lpw.sporteventconfigurator;

public class Running extends Event{
    private int meters;

    public Running(String name, int meters) {
        super(name);

        if(meters < 50 ){
            this.meters = 50;
        } else {
            this.meters = meters;
        }
    }

    public int getMeters() {
        return meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
    }
}
