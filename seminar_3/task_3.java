//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        ArrayList<Integer> data = new ArrayList<>();
        Random rnd = new Random();
        int min;
        int max;
        double avg = 0;
        double counter = 0;
        double midle;
        for (int i = 0; i < 20; i++){
            data.add((Integer) rnd.nextInt(0, 51));
        }
        
        System.out.println(data);

        data.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer numOne, Integer numTwo) {
                if (numTwo < numOne) {
                    return 1;
                }
                else if (numTwo > numOne){
                    return -1;
                }
                return 0;
            }
        });

        for (int n: data) {
            avg += n;
            counter++;
        }
        midle = avg / counter;
        min = Collections.min(data);
        max = Collections.max(data);
        
        System.out.println("--".repeat(10));
        System.out.println(data);
        System.out.println("--".repeat(10));
       
        System.out.println("Минимальное: " + min);
        System.out.println("--".repeat(10));

        System.out.println("Максимальное: " + max);
        System.out.println("--".repeat(10));
        System.out.println("Среднее: " + midle);
    }
    
}
