package model;

public class Student {
    private String name;
    private String lastname;
    private int dateOfBirth;
    private String email;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        if(dateOfBirth < 0){
            System.out.println("On san jaz");
        }else{
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }

    public Student(String name, String lastname, int dateOfBirth, String email) {
        this.name = name;
        this.lastname = lastname;
        if(dateOfBirth < 0){
            System.out.println("On san jaz");
        }else{
            this.dateOfBirth = dateOfBirth;
        }
        this.email = email;



    }
}

