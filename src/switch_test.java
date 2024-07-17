import java.util.Scanner;
public class switch_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default:
                System.out.println("Is not a number");
        }
        switch (num) {
            case 1 -> System.out.println("The number is 1");
            case 2 -> System.out.println("The number is 2");
            case 3 -> System.out.println("The number is 3");
            default -> System.out.println("Is not a number");
        }
    }
}
