package BackToSchool;

public class Teacher extends Person {
    private static String subject;
    private static double salary;


    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;

    }


    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }

    public static void setSubject(String subject) {
        Teacher.subject = subject;
    }

    public static String getSubject() {
        return subject;
    }

    public static void setSalary(double salary) {
        Teacher.salary = salary;
    }

    public static double getSalary() {
        return salary;
    }
    public static String display() {
        System.out.println(getName() + ", " + "age: " + getAge() + ", " + "gender: " + getGender()+ ", "+"sallary: "+getSalary()+ ", "+"subject: "+getSubject());
        return " ";
    }
}
