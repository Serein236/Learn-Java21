import java.util.Scanner;

public class fangfa_fanhui {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        System.out.print("Enter an integer: ");
        b = sc.nextInt();
        int sum = sum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
