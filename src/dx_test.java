public class dx_test {
    public static void main(String[] args) {
        class book{
            public String name;
            public String author;       //类别
            public double price;
        }
        book C = new book();
        C.name = "C语言从入门到精通";
        C.author = "教育";
        C.price = 23.5;
        System.out.print(C.name+"  "+C.author+"  "+C.price);
    }
}
