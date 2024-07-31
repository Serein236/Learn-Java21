public class fangfa_test {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5,6,7,8,9};
       printArr(arr);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
