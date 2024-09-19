package BaekJoon.OldSolve;

import java.util.Scanner;

public class Alram {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hour = sc.nextInt();
    int min = sc.nextInt();

    if ((min + 15) < 60) {
      if (hour == 0) {
        hour += 24;
      }
      System.out.println((hour-1) + " " + (min+15));
    } else if (min + 15 >= 60) {
      System.out.println(hour + " " + (min-45));
    }
  }
}
