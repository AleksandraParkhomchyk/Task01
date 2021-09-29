
import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        int n = 2;
        int[] mas = new int[n];
        int k = 4;
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt();
        }
        for(int i = 0; i < mas.length; i++) {
            if (mas[i] % k == 0) {
                sum = sum + mas[i];
            }
        }

        System.out.printf(String.valueOf(sum));
    }
}

