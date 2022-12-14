package task_price;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String itemName;
        String magName;
        int priceUAH;

        Scanner in = new Scanner(System.in);
        Price[] store = new Price[2];

        for (int i = 0; i < store.length; i++) {
            System.out.println("Введіть назву товару:");
            itemName = in.nextLine();

            System.out.println("Введіть назву магазину:");
            magName = in.nextLine();

            System.out.println("Введіть ціну в гривнях:");
            priceUAH = in.nextInt();

            store[i] = new Price(itemName, magName, priceUAH);
            in.nextLine();
        }

        Arrays.sort(store, new Price());

        System.out.println("Введіть назву магазину для відображення типу товарів:");
        String mag = in.nextLine();

        String searchMagName = null;
        for (int i = 0; i < store.length; i++) {
            if (mag.equals(store[i].getMagName()))
                searchMagName = store[i].getItemName();
        }
            if (searchMagName == null) {
                try {
                    throw new UserException();
                } catch (UserException e) {
                    e.method();
                }
            }
            else
                    System.out.println("Вид товарів даного магазину: " + searchMagName);
        }
    }
