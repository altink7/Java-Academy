package at.altin.fh.lpw.sporteventconfigurator;

public class EventPlan {
    private Event[] events;

    public EventPlan() {
    }


    public void addEventToBack(Event event) {

    }

    public void addEventToFront(Event event) {

    }

    public void clear() {
        events = null;
    }

    public void print() {
        for (int i = 0; i < events.length; i++) {
            System.out.println(events[i]);
        }
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }
}
