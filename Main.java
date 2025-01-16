import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта с константами
        Time time1 = new Time(1, 30, 45);
        System.out.println("Время 1: " + time1);
        System.out.println("Количество секунд: " + time1.calculateSeconds());

        // Создание объекта с введенными значениями
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();
        System.out.print("Введите секунды: ");
        int seconds = scanner.nextInt();

        Time time2 = new Time(hours, minutes, seconds);
        System.out.println("Время 2: " + time2);
        System.out.println("Количество секунд: " + time2.calculateSeconds());

        // Увеличение времени на 5 секунд
        time2.addFiveSeconds();
        System.out.println("Время 2 после добавления 5 секунд: " + time2);
    }
}
