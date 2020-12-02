package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] mass = new int[5];
        for (int indexMass = 0; indexMass < mass.length; indexMass++) {
            mass[indexMass] = indexMass * 2 + 3;
        }
    }
}
