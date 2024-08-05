package duixiang;

import java.util.Scanner;

public class personTese {
    public static void main(String[] args) {
        person p1 = new person();
        Scanner sc = new Scanner(System.in);
        p1.setName("张三");
        p1.setAge(20);
        p1.setGender("暴躁");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());

        p1.eat();

        person p2 = new person();
        System.out.println("请输入姓名: ");
        p2.setName(sc.next());
        System.out.println("请输入年龄(18-25): ");
        p2.setAge(sc.nextInt());
        System.out.println("请输入性格: ");
        p2.setGender(sc.next());

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getGender());

        p2.eat();
    }
}