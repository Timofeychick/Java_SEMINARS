//4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.

package seminar_3;

import java.util.*;

public class task_4 {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        ArrayList<Integer> dataOne = new ArrayList<>();
        ArrayList<Integer> dataTwo = new ArrayList<>();
        ArrayList<Integer> dataThree = new ArrayList<>();
        Random rnd = new Random();
        
        for (int i = 0; i < 10; i++){
            dataOne.add(rnd.nextInt(1,20));
            dataTwo.add(rnd.nextInt(1,25));
        }

        System.out.println("--".repeat(10));
        System.out.println("Первый список: " + dataOne);
        System.out.println("Второй список: " + dataTwo);

        for (int n1: dataOne) {
            for (int n2: dataTwo) {
                if (n1 == n2) dataThree.add(n2);
            }
        }
    
        dataThree.sort(new Comparator<Integer>() {
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
        
        int counter = 10;
        int index = 0;
        while (index < counter) {
            for (int i = 0; i < dataThree.size() - 1; i++) {
                if (dataThree.get(i) == dataThree.get(i + 1)) dataThree.remove(i + 1);
            }
            index++;
        }

        System.out.println("--".repeat(10));
        System.out.println("Элементы, встреч-ся в 2-х списках: " + dataThree);

        Iterator<Integer> iteratorTwo = dataTwo.iterator();

        while (iteratorTwo.hasNext()){
            int n2 = iteratorTwo.next();
            for (int n3: dataThree) {
                if (n2 == n3) iteratorTwo.remove();
            }
        }

        dataOne.addAll(dataTwo);
        dataOne.sort(new Comparator<Integer>() {
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

        System.out.println("--".repeat(10));
        System.out.println("Список 1 + список 2 без повторений + сортировка: " + dataOne);
        

    }

}
