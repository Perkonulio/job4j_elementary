package ru.job4j.condition;

public class Game {
    public void menuChoice(String menu) {
        if (menu.equals("Mario")) {
            System.out.println("Start - Mario");
        } else if (menu.equals("Tanks")) {
            System.out.println("Start - Tanks");
        } else if (menu.equals("Pac-Man")) {
            System.out.println("Start - Pac-Man");
        }
    }

    public static void main(String[] args) {
        Game games = new Game();
        games.menuChoice("Mario");
    }
}
