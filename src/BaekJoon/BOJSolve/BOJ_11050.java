package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_11050 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();

    int n = Integer.parseInt(st.split(" ")[0]);
    int k = Integer.parseInt(st.split(" ")[1]);

    k = ((n - k) < k) ? n - k : k;

    int result = 1;

    for (int i = 0; i < k; i++) {
      result *= n;
      n--;
    }

    for (int i = k; i > 0; i--) {
      result /= k;
      k--;
    }

    bw.write(result + "\n");
    bw.flush();
  }
}
