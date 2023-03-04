//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

package seminar_1;

import java.util.Random;

public class task_2 {

    public static void main(String[] args) {
        
        Random random = new Random();
        int i = random.nextInt(0, 2000);
        int randomNumber = i;
        System.out.println(i);

        int count = 0;

        while (i > 0.99)
        {
            count += 1;
            i /= 2;
        }

        int [] array = new int [count];

        int variable = 0;

        for(int index = 0; randomNumber > 0.99; index++)
        {
            if (randomNumber % 2 > 0) 
            {   
                variable = 1;
                array[index] = variable;
            }
            else
            {
            variable = 0;
            array[index] = variable;
            }
            randomNumber = randomNumber / 2;
        }
        
        for (int index = 0; index < array.length; index++){
        
            System.out.print(array[index]);
        }

        int n = -1;
        int index = 0;
        while (n == -1) {

            if (array[index] > 0){
                n = index;
            }
            index++;
        }

        System.out.print("Номер старшего бита в данном числе: ");
        System.out.println(n);
    }
    
}
