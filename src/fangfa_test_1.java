public class fangfa_test_1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,9,12,124,3452};
        getMax(arr);
    }
    public static void getMax(int [] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
