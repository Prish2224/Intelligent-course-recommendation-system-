import java.util.*;

/** Stores student data safely. Concept: ENCAPSULATION (private fields, controlled access). */
public class Student {
    private final String name;
    private final double cgpa;                         // out of 10
    private final String careerGoal;
    private final Set<String> interests = new HashSet<>();
    private final Map<String, Double> areaMarks = new HashMap<>(); // marks (0-100) per area
    private final Set<String> completedCourses = new HashSet<>();

    public Student(String name, double cgpa, String careerGoal) {
        this.name = name;
        this.cgpa = cgpa;
        this.careerGoal = careerGoal;
    }

    public String getName()       { return name; }
    public double getCgpa()       { return cgpa; }
    public String getCareerGoal() { return careerGoal; }

    public void addInterest(String area)            { interests.add(area.toLowerCase()); }
    public boolean hasInterest(String area)         { return interests.contains(area.toLowerCase()); }
    public void setMark(String area, double marks)  { areaMarks.put(area.toLowerCase(), marks); }

    /** If no marks were given for an area, estimate from CGPA (CGPA x 10). */
    public double getMark(String area) {
        return areaMarks.getOrDefault(area.toLowerCase(), cgpa * 10);
    }

    public void completeCourse(String code)     { completedCourses.add(code.toUpperCase()); }
    public boolean hasCompleted(String code)    { return completedCourses.contains(code.toUpperCase()); }

    public void printProfile() {
        System.out.println("Name: " + name + " | CGPA: " + cgpa + " | Career goal: " + careerGoal);
        System.out.println("Interests: " + interests + " | Completed: " + completedCourses);
    }
}
