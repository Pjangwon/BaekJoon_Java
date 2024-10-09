package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2231_OOO {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int divSum = Integer.parseInt(br.readLine());
    int creator = 0;

    for (int i = 0; i < divSum; i++) {
      int num01 = i;
      int result = num01;

      while (num01 > 0) {
        result += num01 % 10;
        num01 /= 10;
      }

      if (result == divSum) {
        creator = i;
        break;
      }
    }
    bw.write(creator + "\n");
    bw.flush();
  }
}
