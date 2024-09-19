package BaekJoon.OldSolve;

import java.util.Scanner;

public class WhoBig {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {

      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a == 0 & b == 0){
        break;
      }

      String result = (a > b) ? "Yes" : "No";
      System.out.println(result);
    }
    sc.close();
  }
}