package at.altin.fh.lpw.workshopexample;

public class SeniorWorker extends Worker {

    public SeniorWorker(String name) {
        super(name);
    }

    @Override
    int getHourlyRate() {
        return 0;
    }
}
