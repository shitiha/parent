// Name.java
public class Name {
    private String trainNumber;
    private String direction;
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор
    public Name(String trainNumber, String direction, int hours, int minutes, int seconds) {
        this.trainNumber = trainNumber;
        this.direction = direction;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Метод для вычисления количества минут до отправления
    public int minutesUntilDeparture(int currentHours, int currentMinutes) {
        int currentTotalMinutes = currentHours * 60 + currentMinutes;
        int departureTotalMinutes = hours * 60 + minutes;
        return departureTotalMinutes - currentTotalMinutes;
    }

    // Метод для формирования строки информации об объекте
    @Override
    public String toString() {
        return "Поезд: " + trainNumber + ", Направление: " + direction + 
               ", Время отправления: " + hours + ":" + minutes + ":" + seconds;
    }
}
