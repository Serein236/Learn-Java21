import java.util.Scanner;
public class if_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入你的成绩：");
        int n = sc.nextInt();
        if (n < 0 || n > 100) {
            System.out.println("输入有误");
        } else if (n >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        System.out.println("END");

        String a1 = "HELLO";
        String a2 = "hello";
        if (a1.equals(a2)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
