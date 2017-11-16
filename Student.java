package BackToSchool;

public class Student extends Person {
    private static String idNumber;
    private static double gpa;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public static void setIdNumber(String idNumber) {
        Student.idNumber = idNumber;
    }

    public static String getIdNumber() {
        return idNumber;
    }

    public static void setGpa(double gpa) {
        Student.gpa = gpa;
    }

    public static double getGpa() {
        return gpa;
    }
    public static String display() {
        System.out.println(getName() + ", " + "age: " + getAge() + ", " + "gender: " + getGender()+ ", "+"id: "+getIdNumber()+ ", "+"gpa: "+getGpa());
        return " ";
    }
}
