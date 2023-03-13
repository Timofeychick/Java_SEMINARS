// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

package seminar_2;


public class task_3 {

    public static String stringReverse (String userString) {
        if (userString.length() <= 1) {
            return userString;
         }
         return stringReverse(userString.substring(1)) + userString.charAt(0); // substring() - возвращает подстроку
    }                                                                                            // charAt() - получение символа по индексу

    public static void main(String[] args) {
        String userString = "appologize";
        String finalString = stringReverse(userString);
        System.out.println(userString);
        System.out.println(finalString);
    }
}
