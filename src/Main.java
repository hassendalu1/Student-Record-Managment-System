import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentManager manager =
                new StudentManager();

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Generate Report");
            System.out.println("7. Save Text File");
            System.out.println("8. Load Text File");
            System.out.println("0. Exit");

            choice = input.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Department: ");
                    String dept = input.nextLine();

                    System.out.print("GPA: ");
                    double gpa = input.nextDouble();

                    manager.addStudent(
                            new Student(id,name,dept,gpa)
                    );

                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    id = input.nextInt();

                    Student s =
                            manager.searchStudent(id);

                    if(s != null)
                        System.out.println(s);
                    else
                        System.out.println("Not Found");

                    break;

                case 4:

                    System.out.print("ID: ");
                    id = input.nextInt();
                    input.nextLine();

                    System.out.print("New Name: ");
                    name = input.nextLine();

                    System.out.print("New Department: ");
                    dept = input.nextLine();

                    System.out.print("New GPA: ");
                    gpa = input.nextDouble();

                    manager.updateStudent(
                            id,name,dept,gpa);

                    break;

                case 5:

                    System.out.print("ID: ");
                    id = input.nextInt();

                    manager.deleteStudent(id);

                    break;

                case 6:
                    manager.generateReport();
                    break;

                case 7:
                    manager.saveTextFile();
                    break;

                case 8:
                    manager.loadTextFile();
                    break;
            }

        } while(choice != 0);

        System.out.println("Program Ended.");
    }
}