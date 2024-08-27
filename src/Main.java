import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        checkYear(1501);
        checkYear(2015);
        checkYear(2021);
        checkYear(2024);
        System.out.println();

        System.out.println("Задание №2");
        printDeviceVersion(1, 2020);
        printDeviceVersion(0, 2024);
        printDeviceVersion(1, 2024);
        System.out.println();

        System.out.println("Задание №3");
        int days = deliveryDistance(95);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет!");
        }
    }

    public static void checkYear(int year) {
        if (year <= 0) {
            System.out.println("Такого года не может быть!");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void printDeviceVersion(int osType, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year <= 0) {
            System.out.println("Такого года не может быть!");
        } else {
            String type;
            if (osType == 1) {
                type = "Android";
            } else {
                type = "iOS";
            }
            String appType;
            if (year < currentYear) {
                appType = "облегченную ";
            } else {
                appType = "обычную ";
            }
            System.out.println("Установите " + appType + "версию для системы " + type);
        }
    }

    public static int deliveryDistance(int distance) {
        int days = 1;
        int distance0 = 0;
        int distance1 = 20;
        int distance2 = 60;
        int distance3 = 100;
        if (distance > distance1 && distance <= distance2) {
            days++;
        } else if (distance > distance2 && distance <= distance3) {
            days = days + 2;
        } else if (distance > distance3 || distance < distance0) {
            return -1;
        }
        return days;
    }
}