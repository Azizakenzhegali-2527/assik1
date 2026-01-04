package aitu;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Firstname: ");
            String firstname = scanner.nextLine();

            System.out.print("Lastname: ");
            String lastname = scanner.nextLine();

            students[i] = new Student(firstname, lastname);

            for (int j = 0; j < 5; j++) {
                double grade = 2.0 + Math.random() * 2.0;
                students[i].addGrade(grade);
            }
        }

        System.out.println("\nID FIRSTNAME LASTNAME EMAIL GPA");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\nHonors students emails:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].isHonors()) {
                System.out.println(students[i].getEmail());
            }
        }
    }
}
