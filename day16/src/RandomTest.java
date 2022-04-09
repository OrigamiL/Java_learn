import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num =new int[5];
        int temp;
      //  num[0] = random.nextInt(10);
        for (int i = 0; i < 5; i++) {
            temp = random.nextInt(5);
            for (int j = 0; j < i; j++) {
                if (temp==num[j]){
                    temp = random.nextInt(5);
                    j = -1;
                }
            }
            num[i] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
