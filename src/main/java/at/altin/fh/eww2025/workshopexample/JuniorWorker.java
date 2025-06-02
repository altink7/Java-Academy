package at.altin.fh.eww2025.workshopexample;

import at.altin.fh.lpw.workshopexample.Worker;

public class JuniorWorker extends Worker {

    public JuniorWorker(String name) {
        super(name);
    }

    @Override
    int getHourlyRate() {
        return 20;
    }

    @Override
    public String toString() {
        return "Junior (%s)".formatted(name);
    }
}
