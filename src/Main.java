import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Универсальное решение задачи 1 из дополнительных заданий. Вводим стоимость и количество айтемов А. Скидку для айтемов А.
        //Вводим стоимость и количество айтемов B. И выводим сумму всех айтемов на экран.
        System.out.print("Input cost for item A (BYN): ");
        int a = in.nextInt();
        System.out.print("How many items would you like to take?: ");
        int count_a = in.nextInt();
        System.out.print("Percentage of discount for item A(%): ");
        float discount_a = in.nextInt();
        System.out.print("Input cost for item B (BYN): ");
        int b = in.nextInt();
        System.out.print("How many items would you like to take?: ");
        int count_b = in.nextInt();
        double sum = ((a*count_a)*(discount_a / 100)) + (b*count_b);
        System.out.println("Total sum of your items is: " + sum + " (BYN)");

    }
}