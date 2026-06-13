# Student Record Management System

About the Project

-This project is a Student Record Management System developed using Java and Java File I/O concepts. The purpose of the system is to store and manage student information.
 The system allows the user to:
* Add a student
* Search for a student using ID
* Update student information
* Delete a student record
* Display all students
* Generate a report based on GPA

Student Information 
-Each student record contains:
* Student ID
* Student Name
* Department
* GPA

Files Used
-The project uses different types of files:

Text File
-Used to save student information in text format using:
* Scanner
* PrintWriter

Binary File
-Used to save student information in binary format using:
* DataInputStream
* DataOutputStream

Serialized File
-Used to save Student objects directly using:
* ObjectInputStream
* ObjectOutputStream

Report
-The system can generate a simple report showing:
* Total number of students
* Highest GPA
* Lowest GPA
* Average GPA

File Class
-The File class is used to:
* Create files if they do not exist
* Create folders if needed
* Show file name
* Show file path
* Show file size
* Show last modified date

Backup
-Buffered streams are used to create a backup copy of the student records.

Exception Handling
-Try-catch blocks are used to handle errors that may happen while reading or writing files.

Classes Used
1. Student.java
   * Stores student information.
2. StudentManager.java
   * Handles all operations on students.
3. Main.java
   * Contains the menu and runs the program.

Conclusion
-This project helped me understand Java File I/O, object serialization, binary files, text files, exception handling, and how to manage data using Java.

Name: Hassen Mohammed (0049)
