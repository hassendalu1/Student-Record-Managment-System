import java.io.*;
import java.util.*;
public class StudentManager {
private ArrayList<Student> students = new ArrayList<>();
public void addStudent(Student s) {
students.add(s);
}
public void displayStudents() {
for(Student s : students) {
System.out.println(s);
}
}
public Student searchStudent(int id) {
for(Student s : students) {
if(s.getId() == id) {
return s;
}
}
return null;
}
public void deleteStudent(int id) {
Student s = searchStudent(id);
if(s != null) {
students.remove(s);
System.out.println("Student Deleted.");
} else {
System.out.println("Student Not Found.");
}
}
public void updateStudent(int id, String name,
String dept, double gpa) {
Student s = searchStudent(id);
if(s != null) {
s.setName(name);
s.setDepartment(dept);
s.setGpa(gpa);
System.out.println("Student Updated.");
}else {
System.out.println("Student Not Found.");
}
}
public void generateReport() {
if(students.isEmpty()) {
System.out.println("No Students Available.");
return;
}
double highest = students.get(0).getGpa();
double lowest = students.get(0).getGpa();
double total = 0;
for(Student s : students) {
if(s.getGpa() > highest)
highest = s.getGpa();
if(s.getGpa() < lowest)
lowest = s.getGpa();
total += s.getGpa();
}
System.out.println("Total Students: " + students.size());
System.out.println("Highest GPA: " + highest);
System.out.println("Lowest GPA: " + lowest);
System.out.println("Average GPA: " + total/students.size());
}
public void saveTextFile() {
try {
PrintWriter writer =
new PrintWriter("students.txt");
for(Student s : students) {
writer.println(
s.getId() + "," +
s.getName() + "," +
s.getDepartment() + "," +
s.getGpa()
);
}
writer.close();
System.out.println("Saved To Text File.");
} catch(Exception e) {
System.out.println(e.getMessage());
}
}
public void loadTextFile() {
try {
students.clear();
Scanner input =
new Scanner(new File("students.txt"));
while(input.hasNextLine()) {
String line = input.nextLine();
String[] data = line.split(",");
int id = Integer.parseInt(data[0]);
String name = data[1];
String dept = data[2];
double gpa = Double.parseDouble(data[3]);
students.add(
new Student(id,name,dept,gpa)
);
}
input.close();
} catch(Exception e) {
System.out.println(e.getMessage());
}
}
}
