package test2;

public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("XiaoMing", 100,'男');
        Role r2 = new Role("XiaoHong", 100,'女');

        //展示角色
        r1.showRoleInfo();
        r2.showRoleInfo();

        //过程
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + " K O " + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + " K O " + r2.getName());
                break;
            }
        }
    }
}
