package BaekJoon;

import java.util.Scanner;

public class bill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt();
    int N = sc.nextInt();
    int sum = 0;
    String result;

    for (int i = 1; i <= N; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      sum += a * b;
    }
    result = (sum == X) ? "Yes" : "No";
    System.out.println(result);
  }
}