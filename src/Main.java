import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите номер задания от 1 до 10: ");
        int number = in.nextInt();
        switch (number) {
            case 1: {
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
                double sum = ((a * count_a) * (discount_a / 100)) + (b * count_b);
                System.out.println("Total sum of your items is: " + sum + " (BYN)");
                break;
            }

            case 2: {

            }


            case 5: {
                //Задача 5
                System.out.print("Input q: ");
                int q = in.nextInt();
                System.out.print("Input w: ");
                int w = in.nextInt();
                System.out.print("Результат деления: " + (q / w) + " остаток " + (q % w));
                break;
            }

            case 8: {
                //Задача 8
                System.out.println("Привет!");
                int z = 2147483647+1;
                System.out.println(z);
                System.out.println(z*z);
            }

        }
    }
}