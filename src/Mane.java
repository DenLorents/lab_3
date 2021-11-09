import java.util.Scanner;

public class Lab3_main {
    public static Book xBook = new Book();

    public static int CheckCorrectFunction(String value) {
        int func = -1;
        try {
            func = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            func = -1;
        }

        return func;
    }
        public static void main(String[] args) {
            int function;
            try (Scanner in = new Scanner(System.in)) {

                xBook.add(new Book("Гарри Поттер и узник Азкабана", "Джоан Роулинг", 2019, "Азбука-Аттикус", 800, "новая", 2020 ));

                xBook.add(new Book("Зеленая книга", "Стивен Кинг", 2020, "AСТ", 780, "новая",2021
                    ));

                xBook.add(new Book("Свита короля", "Нора Сокавич", 2021, "Popcorn books", 500, "новая",2021
                        ));

                xBook.add(new Book("Побег из шоушенка", "Стивен Кинг", 2011, "Астрель", 260,"новая" ,2021
         ));

                xBook.add(new Book("Жажда жизни", "Ирвинг Стоун", 2019, "АСТ", 390, "новая",2021
                        ));


                do {
                    System.out.println("\nСписок функций: ");
                    System.out.println("[1] - Вывод массива на экран");
                    System.out.println("[2] - Изменить состояние книг , изданных больше N лет назад");
                    System.out.println("[3] - Вывести название всех книг, цена на которые>100 гривен");
                    System.out.println("[4] - Вывести название книг всех данного автора");
                    System.out.println("[5] - Вывести информацию о книгах которые находяться на руках больше 3 месяцев");
                    System.out.println("[0] - Выход из программы");
                    do {
                        System.out.print("Введите номер функции: ");
                        function = CheckCorrectFunction(in.nextLine());
                    } while (function == -1);

                    switch (function) {
                        case 1:
                            System.out.println(xBook);
                            break;
                        case 2:


                            break;
                        case 3:


                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("\nТакой функции нету");
                    }
                } while (function != 0);
            }
        }
    }

