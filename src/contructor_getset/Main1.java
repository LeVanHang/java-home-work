package contructor_getset;

public class Main1 {
    public static void main(String[] args) {


        //lay du lieu ra set
        Student s = new Student("Le Van Hang", 20);
        String name = s.getName();
        int age = s.getAge();

        System.out.println("name: " + name);
        System.out.println("age " + age);
    }
}
