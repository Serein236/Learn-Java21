public class pai {
    public static void main(String[] args) {
        double pi = 0.0;
        double sign = 1.0;
        for (double i = 1.0; i <= 19; i += 2.0) {
            pi = pi + sign * (1.0 / i);
            sign *= -1.0;
            //if(pi < 0.00001) break;
        }
        pi *= 4.0;
        System.out.println(pi);
    }
}
