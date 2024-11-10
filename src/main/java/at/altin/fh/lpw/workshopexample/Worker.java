package at.altin.fh.lpw.workshopexample;

public abstract class Worker {
    protected String name;

    protected Worker(String name) {
        this.name = name;
    }

    abstract int getHourlyRate();

}
