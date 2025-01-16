public class Main {
    public static void main(String[] args) {
        Time time = new Time(1, 30, 45); // Создаем объект Time с 1 часом, 30 минутами и 45 секундами

        System.out.println("Исходное время: " + time);
        System.out.println("Количество секунд: " + time.calculateSeconds());

        time.addFiveSeconds();
        System.out.println("Время после добавления 5 секунд: " + time);
    }
}
