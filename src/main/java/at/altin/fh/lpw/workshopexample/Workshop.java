package at.altin.fh.lpw.workshopexample;

import java.util.ArrayList;

public class Workshop{
    boolean seniorRequired = false;
    private ArrayList<Worker> workerList = new ArrayList<>();
    private Job job;
    public void addWorker(Worker worker) {

        workerList.add(worker);
        if (worker.toString().contains("Senior")) seniorRequired = true;
    }
    public void setJob(CarInspection job){
        this.job = job;
    }
    //The status of a report is "possible"
    // if the number of workers is equal or more than the required workers,
    // otherwise the status is "not possible"
    // One of the workers for the car inspection has to be a senior worker
    // If no senior worker is selected, add the reason "1 senior worker required"
    // The status of a report is "possible" if the minimum number of senior workers
    // are selected, otherwise the status is "not possible" --> see addWorker
    private String getPossibility() {
        return  (workerList.size() >= job.getMinNumberOfWorkers())
                && seniorRequired ? "possible" : "not possible";
    }

    private int getPrice() {
        int price = 0;
        for (Worker worker: workerList){
            price += job.getHours()/ workerList.size() * worker.getHourlyRate();
        }
        price += job.getBasePrice();
        return price;
    }
    // The price of a job is the base price of the job and
    // the hourly rates times the work hours for each worker
    //    Price:
    //            - Senior (Tom) 5 x 50
    //            - Junior (Tina) 5 x 20
    //            - Inspection (new car) 150
    //            ---------
    //            -> 500
    public void printReport(){
        System.out.println("Workshop Report");
        System.out.println("Job: " + job.getClass().getSimpleName());
        System.out.println("Number of workers required " + job.getMinNumberOfWorkers());
        System.out.println("Number of actual workers: " + workerList.size());
        System.out.println(" ");
        System.out.println("Hours needed: " + job.getHours());
        System.out.println(" ");
        System.out.println("Price:");
        for (Worker worker: workerList){
            System.out.printf("- %s %d x %d%n", worker.toString(), job.getHours() / workerList.size(), worker.getHourlyRate());
        }
        System.out.println("- Inspection (new car): " + job.getBasePrice());
        System.out.println("---------");
        System.out.println("-> " + getPrice());
        System.out.println(" ");
        if (!seniorRequired){
            System.out.println("1 senior worker required!");
        }
        if (job.getMinNumberOfWorkers() < 2){
            System.out.println("Job always requires at least two workers!");
        }
        System.out.println("Status: " + getPossibility());
    }
}
