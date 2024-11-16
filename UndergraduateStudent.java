class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int age, int studentId, int[] grades) {
        super(name, age, studentId, grades);
    }

    @Override
    public String getDetails() {
        return "Undergraduate " + super.getDetails();
    }
}