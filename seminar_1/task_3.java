//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

package seminar_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        System.out.println("Максимальное значение, котрое может принять short = 32767");
        Scanner in = new Scanner(System.in);   // VS Code ругается, что 'in' Resource leak: 'in' is never closed
        System.out.print("Укажите, с какого числа стартуем: ");
        short userNumberI = in.nextShort();
        System.out.print("Теперь, укажите ваше число, для которого нужно найти кратные: ");
        short userNumberN = in.nextShort();

        int counter = 0;

        for (short i = userNumberI; i != Short.MAX_VALUE; i++){
            if(i % userNumberN == 0) {
                counter += 1;
            }
        }
        System.out.println(counter);
        short [] arrayM1 = new short [counter];
        short index = 0;
        
        for (short i = userNumberI; i != Short.MAX_VALUE; i++){
            if(i % userNumberN == 0) {
                arrayM1[index] = i;
                index++;
            }
        }

        for (short j = 0; j < arrayM1.length; j++) {
            System.out.println(arrayM1[j]);
        }
        


        

        
        
    }
}
