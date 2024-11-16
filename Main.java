public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5]; // Array to store students
        students[0] = new UndergraduateStudent("AAA", 20, 101, new int[]{90, 85, 88});
        students[1] = new GraduateStudent("BBB", 24, 102, new int[]{78, 82, 80});
        students[2] = new UndergraduateStudent("CCC", 21, 103, new int[]{95, 92, 89});
        students[3] = new GraduateStudent("DDD", 25, 104, new int[]{86, 87, 90});

        // Display all students
        System.out.println("All Students:");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getDetails());
            }
        }

        // Find students eligible for scholarships
        System.out.println("\nEligible for Scholarships:");
        for (Student student : students) {
            if (student != null && student.isEligibleForScholarship()) {
                System.out.println(student.getDetails());
            }
        }

        // Total number of students
        System.out.println("\nTotal Students: " + Student.getTotalStudents());

        // Generate report using multithreading
        ReportGenerator reportGenerator = new ReportGenerator(students);
        Thread reportThread = new Thread(reportGenerator);
        reportThread.start();
    }
}