import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = {1000, 2000, 1500, 3000, 2500};
        int sum = 0;
        for (int expense : arr) {
            sum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задание 2");
        int[] expenses = {12, 4, 222, 15, 525};
        int min = expenses[0];
        int max = expenses[0];

        for (int expense : expenses) {
            if (expense < min) {
                min = expense;
            }
            if (expense > max) {
                max = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");


        System.out.println("Задание 3");
        int[] a = {4653, 55, 1414, 342, 3333};
        int total = 0;
        for (int expense : a) {
            total += expense;
        }
            double average = total / (double)a.length;
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");


        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName [i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 -i] = temp;
        }
        System.out.println(reverseFullName);
    }
    }