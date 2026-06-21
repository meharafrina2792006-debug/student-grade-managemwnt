import java.util.Scanner;

// Parent class (Inheritance)
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface GradeCalculator {
    void calculateGrade();
}

// Child class
class Student extends Person implements GradeCalculator {
    private int mark1, mark2, mark3;
    private double average;
    private char grade;

    // Constructor
    public Student(String name, int id, int mark1, int mark2, int mark3) {
        super(name, id);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Polymorphism
    @Override
    public void calculateGrade() {
        average = (mark1 + mark2 + mark3) / 3.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 50)
            grade = 'C';
        else
            grade = 'F';
    }

    public void display() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name, id, m1, m2, m3);

        s.calculateGrade();
        s.display();
    }
}