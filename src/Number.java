import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        int a, b;//a - загадала программа , b -то, что ввел пользователь

        a = (int) (Math.random() * 10) + 1;
        System.out.println(" Загаданное число  от 1 до 10");
        System.out.print("Ввод числа: ");
        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
            do {
                b = input.nextInt();
                if (b == a) {
                    System.out.println("Вы угадали!");
                } else {

                    if (b > 0 && b <= 10) {
                        System.out.print("Вы не угадали! ");

                        if (a < b) {
                            System.out.println("у меня меньше.");
                        } else {
                            System.out.println("у меня больше");
                        }
                    } else {
                        System.out.println("Неправильный диапазон чисел!");
                    }
                }
            } while (b != a);
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("Попытки закончились! ");
    }
}



