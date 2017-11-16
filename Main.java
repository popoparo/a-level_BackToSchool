package BackToSchool;

public class Main {
    public static void main(String[] args) {
        Person.setName("Victor Tsoy");
        Person.setAge(28);
        Person.setGender("M");
        Person.display();

        Person.setName("Papich");
        Person.setAge(27);
        Person.setGender("M");
        Student.setGpa(999);
        Student.setIdNumber("HS_14-88-228");
        Student.display();

        Person.setName("Johnny Sins");
        Person.setAge(38);
        Person.setGender("M");
        Teacher.setSubject("Porn Actor");
        Teacher.setSalary(100000000);
        Teacher.display();

        Person.setName("Babooshka Lyuba");
        Person.setAge(95);
        Person.setGender("F");
        Student.setGpa(69);
        Student.setIdNumber("HS_1942-1945");
        CollegeStudent.setMajor("Nazzy Destroying");
        CollegeStudent.setYear(1);
        CollegeStudent.display();
    }
}
