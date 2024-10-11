package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_1259 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      String input = br.readLine();

      if (input.equals("0")) {
        break;
      }

      int i = 0;
      boolean isPalindrome = true;

      while (i <= input.length() - i) {
        if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
          isPalindrome = false;
          break;
        }
        i++;
      }
      if (isPalindrome) {
        bw.write("yes\n");
      } else {
        bw.write("no\n");
      }
    }
    bw.flush();
  }
}
