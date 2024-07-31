import java.util.Scanner;

public class fangfa_test_2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int n = sc.nextInt();
        if(containsDuplicate(arr,n))
            System.out.println("n is a duplicate");
        else
            System.out.println("n is not a duplicate");
    }
    public static boolean containsDuplicate(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}
