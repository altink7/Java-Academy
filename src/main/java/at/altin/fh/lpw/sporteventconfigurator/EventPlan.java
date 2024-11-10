package at.altin.fh.lpw.sporteventconfigurator;

import java.util.Arrays;

public class EventPlan {
    private Event[] events;

    public EventPlan() {
    }


    public void addEventToBack(Event event) {
        if (events == null) {
            events = new Event[1];
            events[0] = event;
        } else {
            Event[] newEvents = new Event[events.length + 1];
            for (int i = 0; i < events.length; i++) {
                newEvents[i] = events[i];
            }
            newEvents[events.length] = event;
            events = newEvents;
        }
    }

    public void addEventToFront(Event event) {
        if (events == null) {
            events = new Event[1];
            events[0] = event;
        } else {
            Event[] newEvents = new Event[events.length + 1];
            newEvents[0] = event;
            for (int i = 0; i < events.length; i++) {
                newEvents[i + 1] = events[i];
            }
            events = newEvents;
        }
    }

    public void clear() {
        events = null;
    }

    public void print() {
        if(events == null) {
            System.out.println(this);
            return;
        }

        for (int i = 0; i < events.length; i++) {
            System.out.println(this);
        }
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }


    @Override
    public String toString() {
        //Event Plan:
        //- 100 Meters Running
        //- High Jump Jumping Event
        //- High Jump Jumping Event
        String eventPlan =  "Event Plan:\n";
        if(events == null) {
            return eventPlan + "-- empty --";
        } else {
            for (int i = 0; i < events.length; i++) {
                eventPlan += "- " + events[i].toString() + "\n";
            }
        }
        return eventPlan;
    }
}
