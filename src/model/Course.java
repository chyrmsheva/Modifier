package model;

import java.util.Arrays;

public class Course {
    private String name;
    private String teacherName;
    private int number;
    private Group[] groups;

    public Course() {
    }

    public Course(String name, String teacherName, int number, Group[] groups) {
        this.name = name;
        this.teacherName = teacherName;
        this.number = number;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", number=" + number +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
