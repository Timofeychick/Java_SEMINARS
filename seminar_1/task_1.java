// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

package seminar_1;

import java.util.Random;

public class task_1 {

    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(0, 2000);
        System.out.println(i);

    }

    
}
