Sport Event Validator

You are tasked to build a Sport Event Validator. Users want to build an Event Plan with different Events and want to check, if the Event Plan is valid for a Sport Event. You want to test your design with a quick prototype.

You have to implement the following classes/interfaces (also shown in the class diagram below):

   - EventPlan
        An Event Plan is a class that manages a list of Events. You can add Events to the front and to the back of the list. You can also clear the list or print it. (A print example is given below)
   - Event
        A Event is an abstraction. It only has a name and cannot be instantiated. 
   - Running
        Running is a Sport Event. It is defined by the meters of the running event. The minimum for a running event is 50 meters. If a running event is created with less than 50 meters, it is automatically set to 50 meters.
   - Jumping
        Jumping is a Sport Event. It is defined by the type. Possible types are "High Jump", "Long Jump" or "Triple Jump".
   - SportEvent
        A Sport Event is an interface that evaluates an Event Plan. Implementations of this interface have different rules for a valid Event Plan.
   - JuniorGames
        Junior Games is a Sport Event. The rules for a valid Event Plan are:
            No empty event plan
            No event should be in the plan twice. E.g. no two 100 Meter Runnings or no two High Jump Events, etc.
            The maximum for a Running Event is 1000 Meters
        If any of the above rules are broken, an IllegalArgumentException is thrown. (Messages are in the example below)

The Main class is given, it should be able to produce the example output below. DO NOT MODIFY the main(String[] args) function in any way!

Points

    - Create all classes/interfaces as depicted in the class diagram (50 Points)
        this includes correct naming, field/method access, inheritance and declaration
    - Implement all methods as described in the text above
        EventPlan + Event + Running + Jumping (25 Points)
        SportEvent + JuniorGames (25 Points)
    - Correct usage of the IllegalArgumentException (5 Bonus Points)

Bad formatting, bad naming, syntax errors, compiler errors, etc will lead to point reductions.
Submit your files as a .zip archive.

---

    
    ```
Example Output

Event Plan:
- 100 Meters Running
- High Jump Jumping Event
- High Jump Jumping Event

Event Plan:
-- empty --

Event Plan:
- 4200 Meters Running

Event Plan:
- 50 Meters Running
- Triple Jump Jumping Event

Event Plan is valid for Junior Games
Duplicate Sporting Events in the Event Plan
No Sporting Events in the Event Plan
Running Event is too long for Junior Games 
    ```txt