package BaekJoon.BOJSolve;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10952 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      if ((A+B) > 0){
        bw.write((A + B) + "\n");
      } else {
        break;
      }
    }
    bw.flush();
  }
}