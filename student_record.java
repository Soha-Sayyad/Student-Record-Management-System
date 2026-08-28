import java.util.*;

class Student {
    String name;
    int id;
    float marks;

    Student(String name, int id, float marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}

public class student_record {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = sc.next();

            System.out.println("Enter ID of student " + (i + 1) + ":");
            int id = sc.nextInt();

            System.out.println("Enter marks of student " + (i + 1) + ":");
            float marks = sc.nextFloat();

            Student student = new Student(name, id, marks);

            students.add(student);
        }

        while (true) {

            System.out.println("Enter your choice: 1. Add student, 2. Display students, 3. Delete student, 4. Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter name:");
                    String name = sc.next();

                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    System.out.println("Enter marks:");
                    float marks = sc.nextFloat();

                    Student student = new Student(name, id, marks);

                    students.add(student);

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("\nStudent Records:");

                    for (Student s : students) {
                        System.out.println(
                            "Name: " + s.name +
                            ", ID: " + s.id +
                            ", Marks: " + s.marks
                        );
                    }

                    break;

                case 3:
                    System.out.println("Enter ID of student to delete:");
                    int idToDelete = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == idToDelete) {

                            students.remove(i);

                            System.out.println("Student deleted successfully!");

                            found = true;

                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

