import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите сумму платежа:");
        int payment = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите сумму на балансе:");
        int balance = scanner2.nextInt();

        int bonus = payment >= 1099 ? payment/100 : 0;
        balance += (payment + bonus);

        System.out.println("Спасибо за пополненние, Ваш баланс: " + balance + " руб. Ваш бонус составил: " + bonus + " руб.");

    }
}