package BackToSchool;

public class Person {

    private static String name;
    private static int age;
    private static String gender;

    public Person(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public static int getAge() {
        return age;
    }

    public static void setGender(String gender) {
        Person.gender = gender;
    }

    public static String getGender() {
        return gender;
    }

    public static String display(){
        System.out.println(getName()+", "+"age: "+getAge()+", "+"gender: "+getGender());
        return" ";
    }

}
