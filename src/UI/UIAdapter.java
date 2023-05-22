package UI;

import Repository.DataSource.DataSource;
import Repository.Logic.Logic;

import java.util.Scanner;

public class UIAdapter {

    private final DataSource dataSource;
    private final Logic logic;

    public UIAdapter(DataSource dataSource, Logic logic) {
        this.dataSource = dataSource;
        this.logic = logic;
    }

    public void show(){
        printMenu();
        Scanner console = new Scanner(System.in);

        System.out.println("Введите номер меню");
        int menuNum = console.nextInt();

        while (true){
            if(menuNum == 1){
                System.out.println("Введите ФИО");
                String fio = console.next();
                System.out.println("Рейс");
                String flight = console.next();
                System.out.println("Город отправления");
                String from = console.next();
                System.out.println("Город назначения");
                String where = console.next();
                System.out.println("Авиакомпания");
                String airline = console.next();
                System.out.println("Класс");
                String seatClass = console.next();
                System.out.println("Дата вылета");
                String dateStart = console.next();
                System.out.println("Дата прилёта");
                String dateFinish = console.next();

                System.out.println(String.format("Вы купили билет!"+ "\n"+
                        "ФИО: "+ fio + "\n"+
                        "Рейс: "+ flight+"\n"+
                        "Город отправления: "+ from+"\n"+
                        "Город назначения: "+ where+"\n"+
                        "Авиакомпания: "+airline+"\n"+
                        "Класс: "+seatClass+"\n"+
                        "Дата вылета: "+dateStart+"\n"+
                        "Дата прилёта: "+dateFinish
                ));

                //IMessage messageDecorator = new MessageDecorator();
                Message simpleMessage = new SimpleMessage();
                Message okDecorator = new OkDecorator(simpleMessage);
                System.out.println(String.valueOf(okDecorator.getMessage()));


                System.out.println("Введите номер меню");
                menuNum = console.nextInt();

            } else if (menuNum == 2) {
                System.out.println(String.format("Общая сумма заказов: %f", logic.getAllPriceOfSoldAirTickets()));
            } else if (menuNum == 3) {
                System.out.println(String.format("Всего билетов в заказах: %d", logic.getCountOfSoldAirTickets()));
            } else if (menuNum == 0) {
                System.exit(0);
            }

            System.out.println("Введите номер меню");
            menuNum = console.nextInt();

        }
    }

    public static void printMenu(){
         System.out.println("Меню:\n"+
                "1. Купить билет\n"+
                "2. Вывести общую сумму заказов\n"+
                "3. Вывести количество билетов в заказах\n"+
                "0. Выход");
    }

    public interface Message{
        public String getMessage();
    }

    public class SimpleMessage implements Message{
        private String message = "Сообщение";
        public String getMessage(){
            return this.message;
        }
    }

    public class OkDecorator implements Message{
        private Message message;
        public OkDecorator(Message message){
            this.message = message;
        }
        public String getMessage(){
             return this.message.getMessage() + "\033[32m Успешно \033[0m";
        }
    }

    public class ErrorDecorator implements Message{
        private Message message;
        public ErrorDecorator(Message message){
            this.message = message;
        }

        public String getMessage(){
            return this.message.getMessage() + "\033[3;31m Внимание! \033[0m";
        }
    }
}
