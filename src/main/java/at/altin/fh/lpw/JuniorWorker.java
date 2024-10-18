package at.altin.fh.lpw;

public class JuniorWorker extends Worker {

    public JuniorWorker(String name) {
        super(name);
    }

    @Override
    int getHourlyRate() {
        return 0;
    }
}
