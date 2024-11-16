class ReportGenerator implements Runnable {
    private final Student[] students;

    public ReportGenerator(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {
        System.out.println("\nGenerating Report:");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getDetails());
            }
        }
    }
}