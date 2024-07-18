public class fangfa_gouzao {
    public static void main(String[] args) {
        persons p = new persons("Xiao Ming",12);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class persons {
    private String name;
    private int age;

    public persons(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}