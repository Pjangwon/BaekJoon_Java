package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_1436 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int count = 0;
    int i = 0;

    while (true) {
      i++;
      if (String.valueOf(i).contains("666")) {
        count++;
        if (count == n) {
          bw.write(i + "\n");
          break;
        }
      }
    }
    bw.flush();
  }
}