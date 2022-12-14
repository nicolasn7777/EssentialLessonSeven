package task_worker;

import java.util.Comparator;

public class Worker implements Comparator {
    private String name;
    private String position;
    private int year;

    public Worker() {
    }

    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "Прізвище та ініціали: " + this.name + ". Посада: " + this.position + ". Рік надходження " +
                "на роботу " + this.year;
    }

    @Override
    public int compare(Object o1, Object o2) {
        String name1 = ((Worker)o1).getName();
        String name2 = ((Worker)o2).getName();
        return name1.compareTo(name2);
    }
}
