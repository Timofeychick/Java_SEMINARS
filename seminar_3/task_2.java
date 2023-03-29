//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

package seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
        ArrayList<Integer> data = new ArrayList<>();
        Random rnd = new Random();
        
        for (int i = 0; i < 20; i++){
            data.add((Integer) rnd.nextInt(0, 50));
        }
         
        System.out.println(data);

        data.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer numOne, Integer numTwo) {
                if (numTwo < numOne) return 1;
                else if (numTwo > numOne) return -1;
                return 0;
            }
        });
        
        System.out.println(data);

        data.removeIf(n -> (n % 2 ==0));

        System.out.println(data);

    };

    
}
