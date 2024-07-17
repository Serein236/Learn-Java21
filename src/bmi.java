import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        if(bmi < 18.5){
            System.out.print("体重过轻");
        }else if(bmi < 25){
            System.out.print("体重正常");
        }else if(bmi < 28){
            System.out.print("体重过重");
        }else if(bmi < 32){
            System.out.print("肥胖");
        }else {
            System.out.print("非常肥胖");
        }
    }
}
