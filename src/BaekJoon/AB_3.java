package BaekJoon;

import java.util.Scanner;

public class AB_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    int[] sum = new int[T];

    for (int i = 0; i < sum.length; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();

      sum[i] = A + B;
    }

    for (int i = 0; i < sum.length; i++) {
      System.out.println(sum[i]);
    }
  }
}
