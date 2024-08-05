package duixiang;

public class person {
    private String name;
    private int age;
    private String gender;

    public void setAge(int age) {
        if(age >= 18 && age <= 25)
            this.age = age;
        else
            System.out.println("非法数据");
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void eat(){
        System.out.println("eating");
    }
}
