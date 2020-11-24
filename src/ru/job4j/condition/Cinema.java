package ru.job4j.condition;

public class Cinema {
    public void getAccess(int age) {
        System.out.println("Возраст клиента : " + age);
        if (age > 18) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Это кино для взрослых. Уходи отсюда");
        }
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.getAccess(15);
    }
}
