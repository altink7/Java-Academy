package at.altin.fh.lpw;

public abstract class Worker {
    protected String name;


    public Worker(String name) {
        this.name = name;
    }

    abstract int getHourlyRate();
}
