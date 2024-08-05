package test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "Pen", 8.88, 90);
        Goods g2 = new Goods("002", "Book", 23.83, 20);
        Goods g3 = new Goods("003", "Fox", 188.00, 3);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId()+"  "+arr[i].getName()+"  "+arr[i].getPrice());
        }
    }
}
