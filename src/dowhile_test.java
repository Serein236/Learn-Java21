public class dowhile_test {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        do{
            sum = sum + n;
            n++;
        }while(n <= 100);
        System.out.println(sum);
        sum = 0;
        int m = 20;
        n = 100;
        do{
            sum =sum + m;
            m++;
        }while(m <= n);
        System.out.println(sum);
    }
}
