package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2577 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());

    String result = String.valueOf(A * B * C);

    int[] numberCount = new int[10];

    for (int i = 0; i < result.length(); i++) {
      numberCount[result.charAt(i) - '0']++;
    }

    bw.write(numberCount[0] + "\n");

    for (int i = 1; i < numberCount.length; i++) {
      bw.write(numberCount[i] +"\n");

    }
    bw.flush();
  }
}
