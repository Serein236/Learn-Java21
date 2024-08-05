package test5;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("XiaoMi", 1888, "Red");
        Phone p2 = new Phone("HuaWei", 8888, "Red");
        Phone p3 = new Phone("Apple", 12888, "Red");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        double avg = sum / arr.length;
        System.out.println("The average price is " + avg);
    }
}
