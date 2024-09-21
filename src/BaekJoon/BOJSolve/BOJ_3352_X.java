package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_3352_X {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    boolean[] arr = new boolean[42];
    int count = 0;
    for (int i = 1; i <= 10; i++) {
      arr[Integer.parseInt(br.readLine()) % 42] = true;
    }
    for (int i = 0; i <= 41; i++) {
      if(arr[i]) {
        count++;
      }
    }
    bw.write(count + "\n");
    bw.flush();
  }
}