package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_27866 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();
    int n = Integer.parseInt(br.readLine());

    bw.write(st.charAt(n-1) + "\n");
    bw.flush();
  }
}