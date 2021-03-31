package com.company.lesson3;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static final int Max_number = 10;
    public static final int Count_attempt = 3;

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      String repeatAnswer;

      do {
          int guessNumber = random.nextInt(Max_number);

          for (int i = 1; i <= Count_attempt; i++) {
              System.out.print("Введите число -> ");
              int answer = scanner.nextInt();

              if (answer > guessNumber) {
                  System.out.println("Загаданное число меньше");
                  System.out.println("Осталось " + (Count_attempt - 1) + " попыток");
              } else if (answer < guessNumber) {
                  System.out.println("Загаданное число больше");
                  System.out.println("Осталось " + (Count_attempt - 1) + " попыток");
              } else {
                  System.out.println("Угадали");
                  break;
              }
              if (i = Count_attempt) {
                  System.out.println("Проиграли");
              }
          }
          System.out.println("Повторить? 1 - Да / 0 - Нет");
          repeatAnswer = scanner.next();
      } while (repeatAnswer.equals("Да") || repeatAnswer.equals("1"));

      scanner.close();

    }
}
