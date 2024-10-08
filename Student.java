

import java.util.Scanner;

class Student {
    // Member variables
    private String usn;
    private String name;
    private int[] credits;
    private double[] marks;

    // Constructor
    public Student(int numSubjects) {
        credits = new int[numSubjects];
        marks = new double[numSubjects];
    }

    // Method to accept student details
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        for (int i = 0; i < credits.length; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }

        double sgpa = calculateSGPA();
        System.out.printf("SGPA: %.2f\n", sgpa);
    }

    // Method to calculate SGPA
    public double calculateSGPA() {
        double totalCredits = 0;
        double weightedMarksSum = 0;

        for (int i = 0; i < credits.length; i++) {
            weightedMarksSum += marks[i] * credits[i];
            totalCredits += credits[i];
        }

        return totalCredits == 0 ? 0 : weightedMarksSum / totalCredits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
       
        Student student = new Student(numSubjects);
        student.acceptDetails();
        student.displayDetails();
    }
}


