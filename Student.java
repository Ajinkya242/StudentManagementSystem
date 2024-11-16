public class Student extends Person implements ScholarshipEligibility{
    private static int totalStudents = 0; // Static variable for tracking total students
    private final int studentId;
    private int[] grades;

    public Student(String name, int age, int studentId, int[] grades) {
        super(name, age);
        this.studentId = studentId;
        this.grades = grades;
        totalStudents++;
    }

    static class Course {
        private final String courseName;
        private final String courseCode;

        public Course(String courseName, String courseCode) {
            this.courseName = courseName;
            this.courseCode = courseCode;
        }

        @Override
        public String toString() {
            return "Course: " + courseName + " (" + courseCode + ")";
        }
    }




    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.length == 0 ? 0 : (double) sum / grades.length;
    }

    @Override
    public boolean isEligibleForScholarship() {
        return calculateAverageGrade() > 85;
    }

    @Override
    public String getDetails() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age +
                ", Average Grade: " + calculateAverageGrade();
    }

    public static int getTotalStudents() {
        return totalStudents;
    }




}
