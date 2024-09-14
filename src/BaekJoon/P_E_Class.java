package BaekJoon;

import java.util.Scanner;

public class P_E_Class {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i = 1; i <= (N/4); i++) {
      System.out.print("long ");
    }
    System.out.print("int");
  }
}