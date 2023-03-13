// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
//    3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

package seminar_2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   // VS Code ругается, что 'in' Resource leak: 'in' is never closed
        System.out.print("Введите первое число: ");
        int userNumberOne = in.nextInt();
        System.out.print("Введите второе число: ");
        int userNumberTwo = in.nextInt();
        System.out.println(addiction(userNumberOne, userNumberTwo));
        System.out.println(subtraction(userNumberOne, userNumberTwo));
        System.out.println(multiplication(userNumberOne, userNumberTwo));
        
    }

    public static StringBuilder addiction (Integer numOne, Integer numTwo){
        StringBuilder generalString = new StringBuilder();
        int addiction = numOne + numTwo;
        generalString.append(String.valueOf(numOne)).append(" + ").append(String.valueOf(numTwo)).append(" = ").append(String.valueOf(addiction));
        return generalString;
    }

    public static StringBuilder subtraction (Integer numOne, Integer numTwo){
        StringBuilder generalString = new StringBuilder();
        int subtraction = numOne - numTwo;
        generalString.append(String.valueOf(numOne)).append(" - ").append(String.valueOf(numTwo)).append(" = ").append(String.valueOf(subtraction));
        return generalString;
    }

    public static StringBuilder multiplication (Integer numOne, Integer numTwo){
        StringBuilder generalString = new StringBuilder();
        int multiplication = numOne * numTwo;
        generalString.append(String.valueOf(numOne)).append(" * ").append(String.valueOf(numTwo)).append(" = ").append(String.valueOf(multiplication));
        return generalString;
    }
    

}
