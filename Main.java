// Дополнительный метод для демонстрации работы
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите номер поезда: ");
       String trainNumber = scanner.nextLine();
       System.out.print("Введите направление: ");
       String direction = scanner.nextLine();
       System.out.print("Введите время отправления (часы минуты): ");
       int hours = scanner.nextInt();
       int minutes = scanner.nextInt();

       Name train = new Name(trainNumber, direction, hours, minutes, 0);
       System.out.println(train.toString());
   }
}
