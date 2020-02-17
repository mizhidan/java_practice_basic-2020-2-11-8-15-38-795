
public enum Student {
    Linda("Linda","Female"),Bob("Bob","Male"),Solider("Solider","Male"),Cindy("Cindy","Female");
    private String name;
    private String gender;

    private Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public static void getInfoByGender(String gender) {
        for (Student stu : Student.values()) {
            if (stu.gender.equals(gender)) {
                stu.printStudentInfo();
            }
        }
    }

    public void printStudentInfo() {
        System.out.println(getName());
        System.out.println(getGender());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
