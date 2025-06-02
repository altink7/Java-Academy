package at.altin.fh.eww2025.workshopexample;

public abstract class Worker {
    protected String name;

    protected Worker(String name) {
        this.name = name;
    }

    abstract int getHourlyRate();

}
