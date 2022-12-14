package task_worker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        String position;
        int year;

        Scanner in = new Scanner(System.in);
        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введіть призвіще та ініціали працівника:");
            name = in.nextLine();

            System.out.println("Введіть назву посади працівника:");
            position = in.nextLine();

            System.out.println("Введіть pік надходження на роботу працівника у форматі ХХХХ:");
            year = in.nextInt();
            try {
                if (year>=2022 || year<1000) {
                    throw new Exception("Рік надходження на роботу працівника має бути" +
                            " у форматі ХХХХ та не більше поточного року, введіть корректний рік: ");
                }
        }
            catch (Exception e) {
                System.out.println("Обробка винятка.");
                System.out.println(e.getMessage());
                year = in.nextInt();
            }
            workers[i] = new Worker(name, position, year);
            in.nextLine();
        }

        System.out.println("Проводиться впорядкування працівників за абеткою:");

        Arrays.sort(workers, new Worker());

        for (Worker temp : workers) {
            System.out.println(temp);
        }

        System.out.println("Введіть мінімальний стаж роботи для перевірки нарахування премії:");
        int minYears = in.nextInt();

        System.out.println("Премія за вислугу " + minYears + " років надається таким працівникам:");
        for (int i = 0; i < workers.length; i++) {
            int a = workers[i].getYear();
            if (((2022 - a) > minYears) && a != 0)
                System.out.println(workers[i].getName());
        }
    }
}
