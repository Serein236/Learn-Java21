public class text {
    public static void main(String[] args) {
        int i = 100;
        int n = 0;
        for(;i <= 999;i++){
            if(i % 5 != 0 && i % 2 == 0) {
                System.out.print(i + "\t");
                n++;
                if(n % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
