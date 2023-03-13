// 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки)

package seminar_2;

import java.util.Scanner;

public class task_1 {

    static String stringOne = "Hello, i am Java - cool language!";
    static String attempt = "Hello, i am Java - cool language!";
    static String stringTwo = "Hello, i am new student!";

    public static void main(String[] args) {
        System.out.println(stringOne.contains(attempt));
        System.out.println();
    }
}
