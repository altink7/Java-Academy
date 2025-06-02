# Sport Event Validator

You are tasked to build a Sport Event Validator. Users want to build an Event Plan with different events and want to check if the Event Plan is valid for a sport event. You want to test your design with a quick prototype.

You have to implement the following classes/interfaces (also shown in the class diagram below):

   - **EventPlan**
        - An Event Plan is a class that manages a list of events. You can add events to the front and back of the list. You can also clear the list or print it. (A print example is given below.)
   - **Event**
        - An Event is an abstraction. It only has a name and cannot be instantiated. ( i: for you just a Parent Class /do not concentrate on abstraction/ )
   - **Running**
        - Running is a sport event defined by the meters of the running event. The minimum for a running event is 50 meters. If a running event is created with less than 50 meters, it is automatically set to 50 meters.
   - **Jumping**
        - Jumping is a sport event defined by the type. Possible types are "High Jump," "Long Jump," or "Triple Jump."
   - **SportEvent**
        - A Sport Event is an interface that evaluates an Event Plan. Implementations of this interface have different rules for a valid Event Plan. ( again ignore Interface, for you it is just a parent class )
   - **JuniorGames**
        - Junior Games is a Sport Event. The rules for a valid Event Plan are:
            - The event plan should not be empty.
            - No event should appear more than once in the plan (e.g., no two 100 Meter Runnings or two High Jumps).
            - The maximum distance for a Running event is 1000 meters.
        - If any of the above rules are broken, an `IllegalArgumentException` is thrown. (Error messages are provided in the example below.) (ignore Exception just exit app or print error in your case)

The `Main` class is provided, and it should produce the example output shown below. **Do not modify the `main(String[] args)` function in any way!**

## Points

   - **Class Creation (50 Points)**: Create all classes/interfaces as depicted in the class diagram. This includes correct naming, field/method access, inheritance, and declarations.
   - **Method Implementation (50 Points)**: Implement all methods as described above.
       - `EventPlan` + `Event` + `Running` + `Jumping` (25 Points)
       - `SportEvent` + `JuniorGames` (25 Points)
   - **Exception Handling (5 Bonus Points)**: Correct usage of `IllegalArgumentException`.

Poor formatting, naming, syntax, or compiler errors may lead to point reductions. Submit your files as a `.zip` archive.

---

### Example Output

```txt
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
```
