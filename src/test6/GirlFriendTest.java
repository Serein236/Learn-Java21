package test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] gf = new GirlFriend[4];
        gf[0] = new GirlFriend("XiaoMing", 25, '女', "吃");
        gf[1] = new GirlFriend("XiaoHong", 19, '女', "吃");
        gf[2] = new GirlFriend("XiaoFang", 22, '女', "吃");
        gf[3] = new GirlFriend("XiaoZhang", 21, '女', "吃");

        int sum = 0;

        for (int i = 0; i < gf.length; i++) {
            sum += gf[i].getAge();
        }

        double avg = (double) sum / gf.length;
        System.out.println(avg);

        int n = 0;
        for (int i = 0; i < gf.length; i++) {
            if (gf[i].getAge() < avg) {
                n++;
                System.out.println(gf[i].getName() + " " + gf[i].getAge() + " " + gf[i].getGender() + " " + gf[i].getAge());
            }
        }
        System.out.println("有" + n + "个");
    }
}
