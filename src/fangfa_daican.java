import java.util.Scanner;

public class fangfa_daican {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        System.out.print("Enter an integer: ");
        b = sc.nextInt();
        sum(a,b);
    }
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
}
