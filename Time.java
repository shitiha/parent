public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор по умолчанию
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Конструктор с параметрами
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Метод 1: Вычислить количество секунд
    public int calculateSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Метод 2: Увеличить время на 5 секунд
    public void addFiveSeconds() {
        seconds += 5;
        if (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        if (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
    }

    // Метод для формирования строки информации об объекте
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
