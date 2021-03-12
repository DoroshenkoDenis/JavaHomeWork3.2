import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму платежа:");
        int payment = scanner.nextInt();

        System.out.println("Введите сумму на балансе:");
        int balance = scanner.nextInt();

        int bonus = payment >= 1000 ? payment/100 : 0;
        balance += (payment + bonus);

        System.out.println("Спасибо за пополненние, Ваш баланс: " + balance + " руб. Ваш бонус составил: " + bonus + " руб.");

    }
}