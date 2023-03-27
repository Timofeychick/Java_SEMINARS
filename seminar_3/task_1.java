//1. Реализовать алгоритм сортировки списков компаратором.

package seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
//import java.util.Math;

public class task_1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> data = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++){
            data.add((Integer) rnd.nextInt(0, 15));
        }
         
        data.forEach(n -> System.out.print(n + " "));
        System.out.println(); 

        data.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer numOne, Integer numTwo) {
                if (numTwo < numOne) return 1;
                else if (numTwo > numOne) return -1;
                return 0;
            }
        });
        
        data.forEach(n -> System.out.print(n+","));
        System.out.println();
        
            
    }
    
    
}
