public class fangfa_test {
    public static void main(String[] args) {
        person Ming = new person();
        Ming.setName("Ming");
        Ming.setAge(20);
        System.out.println(Ming.getName()+"   "+Ming.getAge());
        person Hong = new person();
        Hong.setNameAndAge("Hong",24);
        System.out.println(Hong.getName()+"   "+Hong.getAge());
    }
}

class person{
    private String name;
    private int age;
    private int brith;

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }
    public void setNameAndAge(String name, int age) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(age < 0 || age > 100){
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.name = name;
        this.age = age;
    }
}
