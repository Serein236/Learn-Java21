import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
        char [] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i <= 25)
                arr[i] = (char) (97 + i);
            else
                arr[i] = (char) (65 + i - 27);
        }
        Random r = new Random();
        for(int i = 0;i < 4;i++){
            int randomIndex = r.nextInt(arr.length);
            System.out.print(arr[randomIndex]);
        }
        int randomInt = r.nextInt(10);
        System.out.print(randomInt);
    }
}
