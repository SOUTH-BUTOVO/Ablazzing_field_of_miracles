package org.javaacadmey.wonder_field;

import java.util.Scanner;

public class Game {
    private final int amountPlayers = 3;
    private final int amountRounds = 4;
    private final int groupRounds = 3;
    private final int indexFinalRounds = 3;

    Scanner scanner = new Scanner(System.in);

    private void init() {
        System.out.println(
                "Запуск игры \"Поле Чудес\" - подготовка к игре. " + "Вам нужно ввести вопросы и ответы для игры.");

        System.out.println("Введите вопрос #1");
        String quest1 = scanner.nextLine();
    }
}
