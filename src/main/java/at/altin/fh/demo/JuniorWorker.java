package at.altin.fh.demo;

public class JuniorWorker extends Worker{

    public JuniorWorker(String name) {
        super(name);
    }

    @Override
    int getHourlyRate() {
        return 20;
    }
}
