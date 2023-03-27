package seminar_3;

import java.util.*;

public class task_5_6_7 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("Время выполнения методов:");
        System.out.println("--".repeat(15));
        System.out.println("Linked список: " + LinkedList());
        System.out.println("Array список: " + ArrayList());
    }

    public static long LinkedList() {

        long start = System.currentTimeMillis();
        LinkedList<Integer> dataLinked = new LinkedList<>();
        int nul = 0;

        for (int i = 0; i < 200000; i++) {
            dataLinked.add(0, nul);
        }  
        long finish = System.currentTimeMillis();  
        long result = finish - start;
        return result;
    }

    public static long ArrayList(){

        long start = System.currentTimeMillis();
        ArrayList<Integer> dataLinked = new ArrayList<>();
        int nul = 0;

        for (int i = 0; i < 200000; i++) {
            dataLinked.add(0, nul);
        }  
        long finish = System.currentTimeMillis();  
        long result = finish - start;
        return result;
    }
}
