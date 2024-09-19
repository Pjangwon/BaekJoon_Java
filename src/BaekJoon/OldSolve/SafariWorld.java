package BaekJoon.OldSolve;
import java.util.Scanner;

public class SafariWorld {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int diff = (n-m<0) ? -(n-m) : (n-m);
    System.out.println(diff);
  }
}