package at.altin.fh.eww2025.sporteventconfigurator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EventPlan {
    private LinkedList<Event> events = new LinkedList<>();

    public EventPlan() {
    }

    public void addEventToBack(Event event) {
        this.events.addLast(event);
    }

    public void addEventToFront(Event event) {
        this.events.addFirst(event);
    }

    public void clear() {
        this.events.clear();
    }

    public void print() {
        System.out.println("Event Plan:");

        if (this.events.isEmpty()) {
            System.out.println("-- empty --");
        }

        for (Event event : this.events) {
            System.out.println(event.toString());
        }
    }

    public LinkedList<Event> getEvents() {
        return events;
    }

    public void setEvents(LinkedList<Event> events) {
        this.events = events;
    }
}

