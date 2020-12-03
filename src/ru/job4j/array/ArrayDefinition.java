package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "IVAN";
        names[1] = "IGOR";
        names[2] = "OLEGSEY";
        names[3] = "ALEKSEY";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
