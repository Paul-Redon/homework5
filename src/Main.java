//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
        int clientOS1 = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система или год");
        }
        int year = 2021;

        int deliveryDistance = 95;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            days = 0;
        }
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка недоступна");
        }
        int monthNumber = 12;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Некорректный номер месяца");
        } else {
            String season;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "осень";
                    break;
                default:
                    season = "неизвестен";
            }

            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season);
        }
    }
}