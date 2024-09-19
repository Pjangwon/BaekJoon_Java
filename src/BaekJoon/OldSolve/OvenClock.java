package BaekJoon.OldSolve;

import java.util.Scanner;

public class OvenClock {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hour = sc.nextInt();
    int min = sc.nextInt();

    int BakeTime = sc.nextInt();

    if ((min + BakeTime) >= 60) {
      int OverMin = (min + BakeTime) / 60;
      hour += OverMin;

      int RemainMin = (min + BakeTime) % 60;
      min = RemainMin;

      if (hour >= 24) {
        hour -= 24;
      }
    } else {
      min += BakeTime;
    }

    System.out.println(hour + " " + min);
  }
}