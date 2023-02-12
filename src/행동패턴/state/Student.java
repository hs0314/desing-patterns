package 행동패턴.state;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<Course> courses = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public boolean isAvailable(Course course){
        return courses.contains(course);
    }

    public void addPrivate(Course course){
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
