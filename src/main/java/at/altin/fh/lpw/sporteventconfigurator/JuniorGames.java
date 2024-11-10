package at.altin.fh.lpw.sporteventconfigurator;

public class JuniorGames extends SportEvent{

    @Override
    void evaluate(EventPlan eventPlan) {

        if(eventPlan == null || eventPlan.getEvents() == null) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 0; i < eventPlan.getEvents().length; i++) {
            int countTypen = 0;
            Event event = eventPlan.getEvents()[i];


            for (int y = 0; y < eventPlan.getEvents().length; y++) {
                if(eventPlan.getEvents()[y].equals(event)){
                    countTypen+=1;
                }
            }
            if(countTypen > 1) {
                System.out.println("ERROR");
            }

            if(eventPlan.getEvents()[i] instanceof Running running) {
                if(running.getMeters() > 1000) {
                    System.out.println("ERROR");
                }
            }
        }
    }
}
