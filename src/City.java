public class City {
    public static void main(String[] args) {
        class city{
            public String name;
            public double latitude;
            public double longitude;
        }
        city bj =  new city();
        bj.name = "BJ";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println(bj.name + " " + bj.latitude + " " + bj.longitude);
    }
}
