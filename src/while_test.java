public class while_test {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        while (m <= n) {
            sum += m;
            m++;
        }
        System.out.println(sum);
    }
}
