package contructor_getset;

public class Main {
    public static void main(String[] args) {
        //truyen du lieu thong qua contructor
        Student s = new Student("Le Van Hang",31);
        System.out.println(s);

        // truyen dl vao obj thong qua set
        Student s1 = new Student();
        s1.setName("Le Van Hang");
        s1.setAge(30);
        System.out.println(s1);
    }
}
