package at.altin.fh.demo;

public class CarInspection implements Job{
    private Car car;

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
