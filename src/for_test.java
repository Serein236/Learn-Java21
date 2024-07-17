public class for_test {
    public static void main(String[] args) {
        int sum =0;
        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        int s = 0;
        int [] ns = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            s = s + ns[i];
        }
        System.out.println("s = " + s);
    }
}
