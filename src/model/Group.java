package model;

import java.util.Arrays;

public class Group {
    private Student[] students;
    private String description;
    private int dateOfStart;

    public Group(Student[] students, String description, int dateOfStart) {
        this.students = students;
        this.description = description;
        this.dateOfStart = dateOfStart;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(int dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", description='" + description + '\'' +
                ", dateOfStart=" + dateOfStart +
                '}';
    }

    public Group() {


    }
}
