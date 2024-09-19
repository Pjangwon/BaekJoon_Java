package BaekJoon.OldSolve;

import java.util.Scanner;

public class YoonYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();

    year = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    System.out.println(year);
  }
}
