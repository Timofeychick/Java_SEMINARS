// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

package seminar_2;

public class task_2 {

    public static String palindromeFunction (String strOne, String strTwo) {
        String strReverse = new StringBuilder(strTwo).reverse().toString();
        if (strReverse == strOne){
            System.out.println("true");
            System.out.println(strOne);
            System.out.println(strReverse);
        }
        else {
            System.out.println("false");
            System.out.println(strOne);
            System.out.println(strReverse);
        }
        return strReverse;
        
    }
    public static void main(String[] args) {
        String stringOne = "ALLOHA";
        String stringTwo = "AHOLLA";
        String attempt = "Hello, i am Java - cool language!";

        palindromeFunction(stringOne, stringTwo);
    }

}
