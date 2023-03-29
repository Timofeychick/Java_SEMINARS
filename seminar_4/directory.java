//1. Ввод с консоли в формате Ф.И.О Возраст пол
// меню выбора действия
// метод ввода данных (горячая кнопка для выхода)
// вывод неотсортированного списка в формате Иванов Иван Иваныч 32 М
// Два варианта продолжения, либо вывод списка сортированного по возрасту и полу либо завершение приложения.

package seminar_4;

import java.util.*;

import java.io.*;

public class directory {
    public static void main(String[] args) throws IOException {

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        System.out.println("ДОБРО ПОЖАЛОВАТЬ В ТЕЛЕФОННЫЙ СПРАВОЧНИК");

        StartProgram();
    }

    public static void StartProgram() throws IOException {                             // ГЛАВНОЕ МЕНЮ ВЫБОРА ДЕЙСТВИЯ
        
        System.out.println("----".repeat(10));                              // добавить очистку консоли
        System.out.println("Выберите действие: ");
        System.out.println("- - ".repeat(10));
        System.out.println("1. Внесение новых данных.");
        System.out.println("2. Просмотр всего справочника.");
        System.out.println("3. Поиск контактов.");
        System.out.println("4. Выбор сортировки по параметрам.");
        System.out.println("5. Очистить консоль.");
        System.out.println("6. Завершение работы программы.");
        System.out.println("- - ".repeat(10));
        Scanner in = new Scanner(System.in);
        short userNumber = in.nextShort();

        if (userNumber == 1) InputData();
        else if (userNumber == 2) ShowData();
        else if (userNumber == 3) SearchPerson();
        else if (userNumber == 4) SortByParametrs();
        else if (userNumber == 5) ConsoleClear();
        else if (userNumber == 6) StopProgram();
        else {
            System.out.println("----".repeat(10));
            System.out.println("НЕКОРРЕКТНЫЙ ВВОД, ПОПРОБУЙТЕ ЕЩЁ ");
            System.out.println("----".repeat(10));
            StartProgram();
        }
    }

    public static void InputData() throws IOException {                                // ВНЕСЕНИЕ НОВЫХ ПОЛЬЗОВАТЕЛЕЙ
        
        System.out.println("----".repeat(10));
        System.out.println("ВНЕСЕНИЕ ДАННЫХ");
        System.out.println("----".repeat(10));

        System.out.println("<сколько контактов вы хотите добавить?>");
        Scanner max = new Scanner(System.in);
        
        short userMarker = max.nextShort();
        short marker = 0;
        
        try (FileWriter writer = new FileWriter("seminar_4/directory.txt", true)) {
            
            while (marker != userMarker) {

                System.out.println("******nbv".repeat(2));
                System.out.println(marker + 1 + "-й контакт:");
                System.out.println("******".repeat(2));
                System.out.println();
            
                System.out.print("Фамилия: ");
                Scanner one = new Scanner(System.in);
                String surname = one.nextLine();
                writer.write(surname);
                writer.append(' ');
            
                System.out.print("Имя: ");
                Scanner two = new Scanner(System.in);
                String name = two.nextLine();
                writer.write(name);
                writer.append(' ');
            
                System.out.print("Отчество: ");
                Scanner three = new Scanner(System.in);
                String lastName = three.nextLine();
                writer.write(lastName);
                writer.append(' ');
            
                System.out.print("Возраст: ");
                Scanner four = new Scanner(System.in);
                String age = four.nextLine();
                writer.write(age);
                writer.append(' ');
            
                System.out.print("Пол: ");
                Scanner five = new Scanner(System.in);
                String gender = five.nextLine();
                writer.write(gender);
                writer.append(' ');
            
                System.out.print("Телефон: ");
                Scanner six = new Scanner(System.in);
                String telephone = six.nextLine();
                writer.write(telephone);
                writer.append('\n');
            
                writer.flush();
            
                marker++;
            }
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        }
        
        StartProgram();
    }

    public static void ShowData() throws IOException {                                 // ВЫВОД СПРАВОЧНИКА ЦЕЛИКОМ
        
        System.out.println("----".repeat(10));

        File file = new File("seminar_4/directory.txt");
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }


        StartProgram();
    }

    public static void SearchPerson() throws IOException {                             // ПОИСК КОНТАКТА
        
        System.out.println("----".repeat(10));
        System.out.println("Еще на этапе разработки :)");
        StartProgram();
    }

    public static void SortByParametrs() throws IOException {                          // СОРТИРОВКА ПО ПАРАМЕТРАМ + ВЫВОД
        
        System.out.println("----".repeat(10));
        System.out.println("1. Сортировка по полу.");
        System.out.println("2. Сортировка по возрасту");
        Scanner in = new Scanner(System.in);
        short userNumber = in.nextShort();

        File file = new File("seminar_4/directory.txt");
        if (userNumber == 1) {

            System.out.print("\033[H\033[2J");  
            System.out.flush(); 

            System.out.println("- - ".repeat(10));
            try {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                    String fileLine;
                    String [] line;
                    String male = "М";
                    while ((fileLine  = br.readLine() )!= null) {
                       
                        line = fileLine.split(" ");
                        if (line[4].equals(male)) {
                            System.out.println(fileLine);
                        }
                    }
                }
                System.out.println("- - ".repeat(10));

                try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                    String fileLine;
                    String [] line;
                    String female = "Ж";
                    while ((fileLine  = br.readLine() )!= null) {
                       
                        line = fileLine.split(" ");
                        if (line[4].equals(female)) {
                            System.out.println(fileLine);
                        }    
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
 
            StartProgram();
        }
        
        else if (userNumber == 2) {

            System.out.print("\033[H\033[2J");  
            System.out.flush(); 

            System.out.println("- - ".repeat(10));
            ArrayList <Integer> dateListInt = new ArrayList<>();
            int counter = 0;
            try {
                
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                    String fileLine;
                    String [] line;
                    int dateInt;

                    while ((fileLine  = br.readLine() )!= null) {
        
                        line = fileLine.split(" ");
                        dateInt = Integer.parseInt(line[3]);
                        dateListInt.add(dateInt);
                        counter++;
                    }

                    dateListInt.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer numOne, Integer numTwo) {
                            if (numTwo < numOne) return 1;
                            else if (numTwo > numOne) return -1;
                            return 0;
                        }
                    });  
                }

                String [] dateListStr = new String[counter];
                String dateStr;
                for (int i = 0; i < counter; i++ ) {
                    dateStr = dateListInt.get(i).toString();
                    dateListStr[i] = dateStr;
                }
                for (int i = 0; i < counter; i++) {

                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                        String fileLine;
                        String [] line;
                        
                        while ((fileLine  = br.readLine() )!= null) {
            
                            line = fileLine.split(" ");
                            if (line[3].equals(dateListStr[i])) {
                                System.out.println(fileLine);
                            }
                        }   
                    }
                }
            }
            
            catch (IOException e) {
                e.printStackTrace();
            }
            
            StartProgram();
        }
        else {
             System.out.println("<Некорректный ввод, рискни еще раз>");
             SortByParametrs();
        }   
    }

    public static void ConsoleClear() throws IOException {                             // ОЧИСТКА КОНСОЛИ

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        StartProgram();
    }

    public static void StopProgram() {                                                 // ЗАВЕРШЕНИЕ РАБОТЫ ПРОГРАММЫ

        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        
        System.out.println("----".repeat(10));
        System.out.println("РАБОТА ПРОГРАММЫ ЗАВЕРШЕНА");
        System.out.println("ДО СВИДАНИЯ!");
        System.out.println("----".repeat(10));
        System.out.flush(); 
    }
}

// надо добавить автоматическое редактирование файла (чтобы не было лишних пробелов), а то сейчас всё на честном слове