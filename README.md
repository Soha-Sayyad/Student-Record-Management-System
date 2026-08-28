# Student Record Management System

A simple console-based **Student Record Management System** built using Java. This project allows users to manage student records through a menu-driven program.

## Features

* Add new student records
* Display all student records
* Delete a student record using their ID
* Exit the program
* Handle invalid menu choices

## Student Information

Each student record contains:

* Name
* Student ID
* Marks

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Scanner
* Switch-Case

## Concepts Used

This project demonstrates:

* Classes and Objects
* Constructors
* ArrayList
* Scanner for user input
* Switch-case statements
* For loops
* Enhanced for loops
* If-else statements
* Searching and deleting elements

## Project Structure

The program uses a `Student` class to store the details of each student.

```text
Student
├── Name
├── ID
└── Marks
```

Each student's information is stored together in a single object.

All student objects are stored in an `ArrayList`:

```java
ArrayList<Student> students = new ArrayList<>();
```

## How to Run

### 1. Clone the repository

```bash
git clone <repository-url>
```

### 2. Navigate to the project folder

```bash
cd <project-folder>
```

### 3. Compile the program

```bash
javac student_record.java
```

### 4. Run the program

```bash
java student_record
```

## Menu Options

The program provides the following options:

```text
1. Add student
2. Display students
3. Delete student
4. Exit
```

### 1. Add Student

The user enters:

* Name
* Student ID
* Marks

A new `Student` object is created and added to the `ArrayList`.

### 2. Display Students

The program displays all the student records currently stored in the `ArrayList`.

### 3. Delete Student

The user enters the ID of the student they want to delete.

The program searches for the matching student ID. If found, the student record is removed from the `ArrayList`.

### 4. Exit

The program closes and terminates.

## Example

```text
Enter number of students:
2

Enter name of student 1:
Soha
Enter ID of student 1:
101
Enter marks of student 1:
90.5

Enter name of student 2:
John
Enter ID of student 2:
102
Enter marks of student 2:
85.0
```

### Displaying Records

```text
Student Records:

Name: Soha, ID: 101, Marks: 90.5
Name: John, ID: 102, Marks: 85.0
```

### Deleting a Student

```text
Enter ID of student to delete:
101

Student deleted successfully.
```

## Learning Objective

The main objective of this project is to understand how **Object-Oriented Programming** can be used to organize related data.

Instead of storing names, IDs, and marks in separate lists, the program stores all the information about a student inside one `Student` object.

```java
Student student = new Student(name, id, marks);
students.add(student);
```

This makes the program more organized and easier to manage.

## Author

**Soha**
