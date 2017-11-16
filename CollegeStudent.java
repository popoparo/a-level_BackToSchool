package BackToSchool;

public class CollegeStudent extends Student {
    private static int year;
    private static String major;

    public CollegeStudent(String name, int age, String gender) {
        super(name, age, gender);
        this.year = year;
        this.major = major;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        CollegeStudent.year = year;
    }

    public static String getMajor() {
        return major;
    }

    public static void setMajor(String major) {
        CollegeStudent.major = major;
    }

    @Override
    public String toString() {
        return "CollegeStudent{} " + super.toString();
    }
    public static String display() {
        System.out.println(getName() + ", " + "age: " + getAge() + ", " + "gender: " + getGender()+ ", "+"id: "+getIdNumber()+ ", "+"gpa: "+getGpa()+ ", "+"year: "+getYear()+ ", "+"major: "+getMajor());
        return " ";
    }
}
