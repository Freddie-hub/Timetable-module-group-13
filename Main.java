import java.util.*;

// Class representing a single class or session in the timetable
class Class {
    private String subject;
    private String teacher;
    private String room;
    private String timeSlot;

    public Class(String subject, String teacher, String room, String timeSlot) {
        this.subject = subject;
        this.teacher = teacher;
        this.room = room;
        this.timeSlot = timeSlot;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getRoom() {
        return room;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
}

// Class representing a teacher
class Teacher {
    private String name;
    private List<String> subjects;

    public Teacher(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}

// Class representing a subject
class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

// Class representing the school timetable
class Timetable {
    private List<Class> classes;

    public Timetable() {
        this.classes = new ArrayList<>();
    }

    // Add a class to the timetable
    public void addClass(Class newClass) {
        classes.add(newClass);
    }

    // Get all classes in the timetable
    public List<Class> getClasses() {
        return classes;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create subjects
        Subject physics = new Subject("Physics");
        Subject chemistry = new Subject("Chemistry");
        Subject biology = new Subject("Biology");
        Subject history = new Subject("History");
        Subject literature = new Subject("Literature");
        Subject mathematics = new Subject("Mathematics");
        Subject computerScience = new Subject("Computer Science");
        Subject geography = new Subject("Geography");

        // Create teachers
        Teacher teacher1 = new Teacher("Dr. Smith", Arrays.asList("Physics", "Chemistry"));
        Teacher teacher2 = new Teacher("Prof. Johnson", Arrays.asList("Biology"));
        Teacher teacher3 = new Teacher("Ms. Williams", Arrays.asList("History", "Literature"));
        Teacher teacher4 = new Teacher("Mr. Brown", Arrays.asList("Mathematics"));
        Teacher teacher5 = new Teacher("Dr. Davis", Arrays.asList("Computer Science"));
        Teacher teacher6 = new Teacher("Prof. Clark", Arrays.asList("Geography"));

        // Create classes
        Class class1 = new Class(physics.getName(), teacher1.getName(), "Room 101", "Monday 9:00 AM");
        Class class2 = new Class(chemistry.getName(), teacher1.getName(), "Room 102", "Monday 10:00 AM");
        Class class3 = new Class(biology.getName(), teacher2.getName(), "Room 103", "Tuesday 9:00 AM");
        Class class4 = new Class(history.getName(), teacher3.getName(), "Room 104", "Wednesday 10:00 AM");
        Class class5 = new Class(literature.getName(), teacher3.getName(), "Room 105", "Wednesday 11:00 AM");
        Class class6 = new Class(mathematics.getName(), teacher4.getName(), "Room 106", "Thursday 9:00 AM");
        Class class7 = new Class(computerScience.getName(), teacher5.getName(), "Room 107", "Friday 10:00 AM");
        Class class8 = new Class(geography.getName(), teacher6.getName(), "Room 108", "Friday 11:00 AM");

        // Create timetable
        Timetable timetable = new Timetable();
        timetable.addClass(class1);
        timetable.addClass(class2);
        timetable.addClass(class3);
        timetable.addClass(class4);
        timetable.addClass(class5);
        timetable.addClass(class6);
        timetable.addClass(class7);
        timetable.addClass(class8);

        // Display timetable
        System.out.println("Timetable:");
        for (Class scheduledClass : timetable.getClasses()) {
            System.out.println("Subject: " + scheduledClass.getSubject() +
                    ", Teacher: " + scheduledClass.getTeacher() +
                    ", Room: " + scheduledClass.getRoom() +
                    ", Time: " + scheduledClass.getTimeSlot());
        }
    }
}
