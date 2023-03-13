package seminar_2;

public class task_7 {
    public static void main(String[] args) {

        StringBuilderMethod();
        StringBuilderMethod();
        
    }

    public static double StringBuilderMethod (){

        double begin = System.currentTimeMillis();
        StringBuilder myString = new StringBuilder();

        for (int i = 0; i <= 10000; i++){
            myString.append("=");
        }
       String str = "равно ";

        for (int i = 0; i <= 10000; i++){
            myString.replace(i, i + 1, str);
            i += 6;
        }
        System.out.println(System.currentTimeMillis() - begin);
        return begin;
    }

    public static double StringMethod (){
        
        double begin = System.currentTimeMillis();
        String myString = new String();
        String equels = "=";

        for (int i = 0; i <= 10000; i++){
            myString += equels;
        }

        String str = "равно ";
        for (int i = 0; i <= 10000; i++){
            myString.replace("=", str);
        }
        System.out.println(System.currentTimeMillis() - begin);
        return begin;
    }
}
