package corejava.collections;

import java.awt.datatransfer.FlavorEvent;
import java.util.Objects;

// Comparable is tell the collection like list to sort using     `
public class Student implements Comparable<Student> {

    private String name;
    private double cgpa;

    public Student (String name, double cgpa) {
        this.cgpa = cgpa;
        this.name = name;
    }

    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // this method for HashMap to return hashcode
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    // This method also for HashMap so value override make be possible
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this != obj)
            return false;

        if(getClass() != obj.getClass() )
            return false;
        Student other = new Student();
        return  cgpa == other.cgpa && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getCgpa(), this.getCgpa());
    }

}
