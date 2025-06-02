package at.altin.fh.eww2025.workshopexample;

import at.altin.fh.lpw.workshopexample.Car;
import at.altin.fh.lpw.workshopexample.Job;

public class CarInspection implements Job {
    private at.altin.fh.lpw.workshopexample.Car car;

    public CarInspection(Car car) {
        this.car = car;
    }

    @Override
    public int getMinNumberOfWorkers() {
        return 2;
    }

    @Override
    public int getBasePrice() {
        if(car.year < 2000) {
            return 200;
        } else {
            return 150;
        }
    }

    @Override
    public int getHours() {
        return 10;
    }
}
