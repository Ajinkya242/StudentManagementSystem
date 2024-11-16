class GraduateStudent extends Student {
    public GraduateStudent(String name, int age, int studentId, int[] grades) {
        super(name, age, studentId, grades);
    }

    @Override
    public String getDetails() {
        return "Graduate " + super.getDetails();
    }
}