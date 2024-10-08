package BaekJoon.OldSolve;

import java.io.*;

public class Fast_AB {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String s = br.readLine();
      int A = Integer.parseInt(s.split(" ")[0]);
      int B = Integer.parseInt(s.split(" ")[1]);
      bw.write(String.valueOf(A+B) );
      bw.newLine();
    }
    bw.flush();
  }
}
