package test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"风流俊雅", "气字轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立”,“身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述:
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】连环攻向%s。"
    };
    //injured 受伤描述:
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去!"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //获取Face
    public String getFace() {
        return face;
    }

    //设置Face
    public void setFace(char gender) {
        if (gender == '男') {
            int i = new Random().nextInt(boyfaces.length);
            this.face = boyfaces[i];
        } else if (gender == '女') {
            int i = new Random().nextInt(girlfaces.length);
            this.face = girlfaces[i];
        } else {
            this.face = "面目全非";
        }
    }

    //获取Gender
    public char getGender() {
        return gender;
    }

    //设置Gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    //攻击
    public void attack(Role role) {
        int i = new Random().nextInt(attacks_desc.length);
        String str = attacks_desc[i];
        //攻击效果
        System.out.printf(str, this.getName(), role.getName());
        System.out.println();
        int hut = new Random().nextInt(20) + 1;
        int remainBoold = role.getBlood() - hut;

        if (remainBoold < 0) remainBoold = 0;
        role.setBlood(remainBoold);

        //受伤描述
        if (remainBoold > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        }else if (remainBoold > 80) {
            System.out.printf(injureds_desc[1], role.getName());
        }else if (remainBoold > 70) {
            System.out.printf(injureds_desc[2], role.getName());
        }else if (remainBoold > 60) {
            System.out.printf(injureds_desc[3], role.getName());
        }else if (remainBoold > 40) {
            System.out.printf(injureds_desc[4], role.getName());
        }else if (remainBoold > 20) {
            System.out.printf(injureds_desc[5], role.getName());
        }else if (remainBoold > 10) {
            System.out.printf(injureds_desc[6], role.getName());
        }else{
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
    }

    //展示信息
    public void showRoleInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Blood: " + this.getBlood());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Face: " + this.getFace());
    }
}
