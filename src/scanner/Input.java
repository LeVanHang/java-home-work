package scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name");
        String name = sc.nextLine();
        System.out.println("name: " + name);

        System.out.println("input age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("age: " + age);

        System.out.println("input your mark");
        double mark = Double.parseDouble(sc.nextLine());
        System.out.println("mark: " + mark);


    }
}
