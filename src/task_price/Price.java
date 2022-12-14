package task_price;

import java.util.Comparator;

public class Price implements Comparator {
    private String itemName;
    private String magName;
    private int priceUAH;

    public Price() {
    }

    public Price(String name, String nameMag, int priceUAH) {
        this.itemName = name;
        this.magName = nameMag;
        this.priceUAH = priceUAH;
    }

    public String getItemName() {
        return itemName;
    }

    public String getMagName() {
        return magName;
    }

    public int getPriceUAH() {
        return priceUAH;
    }

    @Override
    public String toString(){
        return "Назва товару: " + this.itemName + ". Назва магазину: " + this.magName + ". Ціна в гривнях: "
                + this.priceUAH;
    }

    @Override
    public int compare(Object o1, Object o2) {
        String name1 = ((Price)o1).getMagName();
        String name2 = ((Price)o2).getMagName();
        return name1.compareTo(name2);
    }
}
