import java.util.Scanner;

public class fangfa_test_3 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int from = 0;
        int to = arr1.length-1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer(from)");
        from = sc.nextInt();
        System.out.print("Enter an integer(to)");
        to = sc.nextInt();
        copyArr(arr1, from, to);
    }
    public static void copyArr(int[] arr1, int from, int to) {
        int [] copyArr = new int[to-from];
        int j = 0;
        for (int i = from; i < to; i++) {
            copyArr[j++] = arr1[i];
        }
        for(int i =0; i<copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
}
