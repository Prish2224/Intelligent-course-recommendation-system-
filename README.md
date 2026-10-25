# Intelligent Course Recommendation System

Course: Object Oriented Techniques using Java (CCSE0355)
Group: 57 | SDG-4 (Quality Education)
Type: Standalone, console-based Java application (no website, no database)

## How to run

**IntelliJ IDEA / VS Code**
1. Open this folder as a Java project (JDK 8 or above).
2. Open `Main.java` and run the `main()` method.
3. Use the menu shown in the console.

**Terminal / Command Prompt** (inside this folder)

    javac *.java
    java Main

## What it does
A student enters a profile (name, CGPA, career goal, interest areas and marks).
The system scores every course and shows the top 5 matches with the reason.
Score (out of 100) = interest match (40) + career match (30) + performance fit (20) + course-type bonus (10).
Courses already completed are not recommended again.

## Files
| File | Purpose |
|---|---|
| Main.java | Entry point; creates the main objects and starts the program |
| ConsoleUI.java | Menu, keyboard input and output |
| CourseCatalog.java | List of available courses |
| Course.java | Abstract parent class of all courses |
| CoreCourse.java | Core (foundation) course type |
| ElectiveCourse.java | Elective (optional) course type |
| Student.java | Stores student profile data |
| Recommendation.java | A recommended course with its score and reason |
| RecommendationEngine.java | Scoring and ranking logic |
| Displayable.java | Interface for classes that can display themselves |

## OOP concepts used
Classes and objects, encapsulation, abstraction (abstract class and interface),
inheritance, polymorphism (method overriding), constructors,
collections (ArrayList, HashSet, HashMap) and exception handling.
