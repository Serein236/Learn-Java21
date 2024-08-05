package test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("输入品牌");
            car.setBrand(sc.next());
            System.out.println("请输入价格");
            car.setPrice(sc.nextInt());
            System.out.println("请输入颜色");
            car.setColor(sc.next());
            arr[i] = car;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand() + ", " + arr[i].getColor() + ", " + arr[i].getPrice());
        }
    }
}
