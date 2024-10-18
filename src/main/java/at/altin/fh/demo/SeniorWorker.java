package at.altin.fh.demo;

public class SeniorWorker extends Worker{

    public SeniorWorker(String name) {
        super(name);
    }

    @Override
    int getHourlyRate() {
        return 50;
    }
}
