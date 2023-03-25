import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String logIn = "Нуу, поехали!";
        System.out.println(logIn);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Как тебя зовут? ");
        String name = myScanner.nextLine();

        int a = (int) (Math.random() * (100 + 0)) + 0;

        System.out.println("Попробуй-ка угадать число от 0 до 100");
        Scanner myScanner1 = new Scanner(System.in);
        int b = 0;
        while (b != a) {

            b = myScanner1.nextInt();
            if (b < a) {
                System.out.println("Надо больше. Повтори попытку.");
            }
            if (b > a) {
                System.out.println("Надо меньше. Повтори попытку.");
            }

        } System.out.println("Да! Поздравляю," + name + "!") ;
    }
}