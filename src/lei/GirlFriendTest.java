package lei;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "张三";
        gf1.age = 18;
        gf1.gender = "屌";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.sleep();
        gf1.eat();

        GirlFriend gf2 = new GirlFriend();
        gf2.name = "李四";
        gf2.age = 18;
        gf2.gender = "无言以对";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);
    }
}
