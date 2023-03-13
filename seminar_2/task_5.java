// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

package seminar_2;

public class task_5 {
    public static void main(String[] args) {
        int userNumberOne = 24;
        int userNumberTwo = 4;
        System.out.println(addiction(userNumberOne, userNumberTwo));
        System.out.println(subtraction(userNumberOne, userNumberTwo));
        System.out.println(multiplication(userNumberOne, userNumberTwo));
        
    }

    public static StringBuilder addiction (Integer numOne, Integer numTwo){
        StringBuilder generalString = new StringBuilder();
        int addiction = numOne + numTwo;
        generalString.append(String.valueOf(numOne)).append(" + ").append(String.valueOf(numTwo)).append(" = ").append(String.valueOf(addiction));
        generalString.insert(8, "равно");
        generalString.deleteCharAt(7);
        return generalString;
    }

    public static StringBuilder subtraction (Integer numOne, Integer numTwo){
        StringBuilder generalString = new StringBuilder();
        int subtraction = numOne - numTwo;
        generalString.append(String.valueOf(numOne)).append(" - ").append(String.valueOf(numTwo)).append(" = ").append(String.valueOf(subtraction));
        generalString.insert(8, "равно");
        generalString.deleteCharAt(7);
        return generalString;
    }

    public static StringBuilder multiplication (Integer numOne, Integer numTwo){
        StringBuilder generalString = new StringBuilder();
        int multiplication = numOne * numTwo;
        generalString.append(String.valueOf(numOne)).append(" * ").append(String.valueOf(numTwo)).append(" = ").append(String.valueOf(multiplication));
        generalString.insert(8, "равно");
        generalString.deleteCharAt(7);
        return generalString;
    }
}
