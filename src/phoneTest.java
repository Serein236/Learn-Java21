public class phoneTest {
    public static void main(String[] args) {
        phone p = new phone();
        p.brand = "XiaoMi";
        p.price = 1999.99;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();
        phone p2 = new phone();
        p2.brand = "Apple";
        p2.price = 8999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();
    }
}
