import java.io.Serializable;
public class Student { 
    private int id;
    private String name;
    private String department;
    private double gpa;
    public Student(int id, String name, String department, double gpa) {
        id = id;
        name = name;
        this.department = department;
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }
    public void getName() { 
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getGpa() {
        return gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        department = this.department; 
    }
    public void setGpa(gpa) { 
        this.gpa = gpa;
    }
    public String tostring() {
        return id + ", " + name + ", " + department + ", GPA: " + gpa;
    }
}
