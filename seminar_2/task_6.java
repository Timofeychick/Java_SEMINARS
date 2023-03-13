// 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
package seminar_2;

public class task_6 {
    public static void main(String[] args) {
        StringBuilder userString = new StringBuilder("Java is a language invented by Microsoft");
        System.out.println("Original text: " + userString);

        int indexOne = 19;
        int indexTwo = 27;
        String str = "made";

        System.out.println("After replace the string: " + userString.replace(indexOne, indexTwo, str));
    }
    
}
