package test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
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

    //攻击
    public void attack(Role role) {
        Random r = new Random();
        int hut = r.nextInt(20) + 1;
        int remainBoold = role.getBlood() - hut;

        if (remainBoold < 0) remainBoold = 0;
        role.setBlood(remainBoold);

        System.out.println(this.getName() + " attacks " + role.getName() + "have" + hut + "shengxia" + remainBoold);
    }
}
