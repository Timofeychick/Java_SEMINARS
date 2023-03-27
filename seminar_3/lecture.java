
// коллекции Java

// тип данных Object - можно положить любой объект и затем вытащить его (упаковка и распаковка)
package seminar_3;

import java.util.ArrayList;
import java.util.List;

public class lecture {
    public static void main(String[] args) {
        
        Object one = "animal"; GetType(one);
        Object two = 3.5; GetType(two);
        Object three = 13; GetType(three);
        Object four = 3; GetType(four);

        // System.out.println(Sum(1, 2));  // Sum - метод сложения
        // System.out.println(Sum(1.0, 2));
        // System.out.println(Sum(1, 2.0)); 
        // System.out.println(Sum(1.2, 2.1));
        // System.out.println(Sum(two, three));
        // System.out.println(Sum(four, three));

        // коллекция данных List - пронумерованный набор элементов. К данным из List пользователь может обращаться по указанному индексу
        ArrayList data = new ArrayList<>();
        ArrayList<Integer> dataTwo = new ArrayList<>(); // в <> скобках после ArrayList можно указать тип данных, хранящихся в коллекции, в данном случае Integer (обобщение)
    

        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>(10);
        // ArrayList<Integer> list4 = new ArrayList<>(list3);
        
        
        data.add(2344); // .add - добавить элемент в коллекцию
        data.add("2344");
        dataTwo.add(2344); 
        //dataTwo.add("2344");

        for (Object object : dataTwo) { // цикл вывода данных из коллекции List
            System.out.println(object + " ");
        }

        
    }

    private static void GetType(Object object) {

        System.out.println(object.getClass().getName()); // .getClass().getName() - надо загуглить
    }

    private static Object Sum (Object numOne, Object numTwo) {

        if (numOne instanceof Double && numTwo instanceof Double) {
            double one = (Double) numOne;
            double two = (Double) numTwo;
            double sum = one + two;
            return (Object) sum; // (Object)(Double) numOne + (Double) numTwo
        }
        else if (numOne instanceof Integer && numTwo instanceof Integer) {
            int one = (Integer) numOne;
            int two = (Integer) numTwo;
            int sum = one + two;
            return (Object) sum;
        }
        else {
            return 0;
        }
    }
}

