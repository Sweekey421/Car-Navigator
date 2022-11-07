import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car ();
        System.out.println("Введите растояние, которое Вам необходимо проехать (в км): ");
        int r = scanner.nextInt();
        navigator navigator = new navigator( r ,car1);
        navigator.run();
    }
}