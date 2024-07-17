import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 100;
        System.out.println(a);
        a = 205;
        System.out.println(a);
        System.out.println("a=" + a);
        a += a;
        System.out.println(a);
        String c = "aa dws";
        System.out.println(c);
        System.out.println("c=" + c);
        var ccc = new StringBuilder();
        a = a << 1;
        System.out.println(a);
        short x = 100;
        int y = 10;
        int z = x + y;
        System.out.println(z);
        //数组
        int [] db = new int [10];
        System.out.println(db.length);
        db[0] = 5;
        System.out.println(db[0]);
        int [] sz;
        sz = new int[] {9,8,7,6,5,4,3,2,1,0};
        System.out.println(sz.length);
        for(int i = 0; i < sz.length; i++){
            System.out.print(sz[i]);
        }
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        System.out.print("输入之前的成绩");
        int og = sc.nextInt();
        System.out.print("输入最近的成绩");
        int ng = sc.nextInt();
        double bfb = ((double)ng - (double)og) / og * 100;
        System.out.printf("提升了%.2f%%",bfb);
    }
}
