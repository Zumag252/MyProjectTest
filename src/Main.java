public class Main {
    public static void main(String[] args) {
        Student st = new Student("Max", "Zhuravlev", 33);
        System.out.println();
        System.out.println();
    }
}

class Student {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
class StudentTest {

}
