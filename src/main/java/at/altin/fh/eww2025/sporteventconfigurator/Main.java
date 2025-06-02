package at.altin.fh.eww2025.sporteventconfigurator;

public class Main {
    public static void main(String[] args) {
SportEvent event = new JuniorGames();

EventPlan withDuplicates = new EventPlan();

withDuplicates.addEventToBack(new Jumping("Qualification", JumpType.HIGH_JUMP));
withDuplicates.addEventToFront(new Running("Start Event", 100));
withDuplicates.addEventToBack(new Jumping("Qualification", JumpType.HIGH_JUMP));

withDuplicates.print();

try {
    event.evaluate(withDuplicates);
} catch (IllegalArgumentException e) {
    System.err.println(e.getMessage());
}

EventPlan empty = new EventPlan();

empty.addEventToFront(new Jumping("Start Event", JumpType.LONG_JUMP));
empty.clear();

empty.print();

try {
    event.evaluate(empty);
} catch (IllegalArgumentException e) {
    System.err.println(e.getMessage());
}

EventPlan tooLongRunning = new EventPlan();

tooLongRunning.addEventToBack(new Running("Marathon", 4200));

tooLongRunning.print();

try {
    event.evaluate(tooLongRunning);
} catch (IllegalArgumentException e) {
    System.err.println(e.getMessage());
}

 EventPlan valid = new EventPlan();

 valid.addEventToFront(new Running("50 Meter Running", -50));
 valid.addEventToBack(new Jumping("Finals", JumpType.TRIPLE_JUMP));

 valid.print();

 try {
     event.evaluate(valid);
 } catch (IllegalArgumentException e) {
     System.err.println(e.getMessage());
 }
    }
}
