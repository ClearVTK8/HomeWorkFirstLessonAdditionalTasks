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
                System.out.print("Input cost for item A (BYN): ");
                int a2 = in.nextInt();
                System.out.print("How many items would you like to take?: ");
                int count_a2 = in.nextInt();
                System.out.print("Input cost for item B (BYN): ");
                int b2 = in.nextInt();
                System.out.print("How many items would you like to take?: ");
                int count_b2 = in.nextInt();
                double sum2;
                if (count_a2 > 0 & count_b2 > 0) {
                    sum2 = (((a2 * count_a2) + (b2 * count_b2)) * 0.9);
                    System.out.println("Цена товара составляет: " + sum2);
                    System.out.println("Ваша скидка: " + (((a2 * count_a2) + (b2 * count_b2)) * 0.1));
                }
                if (count_a2 == 0 | count_b2 == 0)
                {
                    System.out.println("Цена товара составляет: " + ((a2 * count_a2) + (b2 * count_b2)));
                }
                if (count_a2 < 0 | count_b2 < 0){
                    System.out.println("Произошла ошибка!!!!");
                }
                break;
            }

            case 3:{
                int x3 = 5;
                int y3 = 10;
                double gipotenuza3 = Math.sqrt((x3*x3) + (y3*y3));
                System.out.println("Gipotenuza = " + gipotenuza3);
                break;
            }

            case 4: {
                System.out.print("Введите х: ");
                int x4 = in.nextInt();
                System.out.print("Введите y: ");
                int y4 = in.nextInt();
                double gipotenuza4 = Math.sqrt((x4*x4) + (y4*y4));
                System.out.println("Gipotenuza = " + gipotenuza4);
                break;
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

            case 6:{
                System.out.print("Введите 3 значное натуральное число: ");
                int number6 = in.nextInt();
                int first_digit = number6 / 100;
                int second_digit = (number6 % 100) / 10;
                int third_digit = ((number6 % 100) % 10);
                System.out.print("Сумма цифр этого числа = " + (first_digit + second_digit + third_digit));
                break;
            }

            case 8: {
                //Задача 8
                System.out.println("Привет!");
                int z = 2147483647+1;
                System.out.println(z);
                break;
            }

            case 9:{
                int x9 = 5;
                int y9 = 7;
                float z9 = 0;
                float k9 = 9;
                k9 = x9/z9;
                System.out.println("k= " + k9);
                z9 = ((x9*x9) + (y9*y9));
                System.out.println("z= " + z9);
                System.out.println("z= " + Math.pow(x9, 3));
                break;

            }

        }
    }
}