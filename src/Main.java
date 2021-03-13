import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму платежа:");
        double payment = scanner.nextDouble();
        System.out.println("Введите сумму на балансе:");
        double balance = scanner.nextDouble();
        int bonus = payment > 1000 ? (int) (payment / 100) : 0;
        double totalBalance = (balance + payment + bonus);

        System.out.println("Спасибо за пополненние, Ваш баланс: " + totalBalance + " руб. Ваш бонус составил: " + bonus + " руб.");
    }
}