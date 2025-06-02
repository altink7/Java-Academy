package at.altin.fh.eww2025.sporteventconfigurator;

public class JuniorGames implements SportEvent {


    public void evaluate(EventPlan eventPlan) throws IllegalArgumentException {
        // The event plan should not be empty.
        if(eventPlan.getEvents() == null || eventPlan.getEvents().isEmpty()) {
            System.out.println("No Sporting Events in the Event Plan");
            throw new IllegalArgumentException("No Sporting Events in the Event Plan");
        }

        //No event should appear more than once in the plan (e.g., no two 100 Meter Runnings or two High Jumps).
        for(Event event : eventPlan.getEvents()) {
            int eventNumber = 0;

            for(Event nestedEvent : eventPlan.getEvents()) {
                if(event.equals(nestedEvent)){
                    eventNumber++;
                }
            }

            if(eventNumber >= 2){
                System.out.println("Duplicate Sporting Events in the Event Plan");
                throw new IllegalArgumentException("Duplicate Sporting Events in the Event Plan");
            }
        }

        //The maximum distance for a Running event is 1000 meters.
        for(Event event : eventPlan.getEvents()) {
            if(event instanceof Running running){
                if(running.getMeters() >= 1000){
                    System.out.println("Running Event is too long for Junior Games");
                    throw  new IllegalArgumentException("Running Event is too long for Junior Games");
                }
            }
        }

        System.out.println("Event Plan is valid for Junior Games");
    }
}
