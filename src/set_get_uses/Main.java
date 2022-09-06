package set_get_uses;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        // truyền dữ liệu vào thì dùng set. lấy dữ liệu dùng get

        s.setName("Le Van Hang");
        s.setAge(31);

       String name = s.getName();
       int  age = s.getAge();

        System.out.println("name "+ name);
        System.out.println("age" +age);
    }
}
