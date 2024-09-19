package BaekJoon.OldSolve;
import java.util.Scanner;

public class Shares {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(b/(a+1));
    }
    sc.close();
  }
}
