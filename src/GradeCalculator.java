// Program to calculate the average grade of students

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents;
        double sum = 0;

        System.out.println("Enter the total number of students:");
        totalStudents = scanner.nextInt();

        // Input grades
        for (int i = 1; i <= totalStudents; i++) {
            System.out.println("Enter the grade for student " + i + ":");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        // Calculate average
        double average = sum / totalStudents;
        System.out.println("The average grade of the class is: " + average);
    }
}
