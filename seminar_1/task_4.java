//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)

package seminar_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        
        System.out.println("Минимальное значение, котрое может принять short = -32767");
        Scanner in = new Scanner(System.in);   // VS Code ругается, что 'in' Resource leak: 'in' is never closed
        System.out.print("Укажите, до какого числа идём: ");
        short userNumberI = in.nextShort();
        System.out.print("Теперь, укажите ваше число, и мы найдем все НЕКРАТНЫЕ ему числа: ");
        short userNumberN = in.nextShort();

        int counter = 0;

        for (short i = Short.MIN_VALUE; i != userNumberI; i++){
            if(i % userNumberN != 0) {
                counter += 1;
            }
        }
        System.out.println(counter);

        short [] arrayM2 = new short [counter];
        short index = 0;
        
        for (short i = Short.MIN_VALUE; i != userNumberI; i++){
            if(i % userNumberN != 0) {
                arrayM2[index] = i;
                index++;
            }
        }

        for (short j = 0; j < arrayM2.length; j++) {
            System.out.println(arrayM2[j]);
        }
    }
    
}
