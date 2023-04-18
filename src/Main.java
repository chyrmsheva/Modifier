import model.Course;
import model.Group;
import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student studens = new Student("Aksana","Chyrmasheva",1999,"aksanachyrmasheva@gmail.com");
        Student[] students = new Student[]{studens};
        Group groups = new Group(students,"java 6",1);
        Group[] groups1 = new Group[]{groups};
        Course course = new Course("Peaksoft","Meder",12345,groups1);//new group[]{groups1}

        System.out.println(course);






        }

    }
