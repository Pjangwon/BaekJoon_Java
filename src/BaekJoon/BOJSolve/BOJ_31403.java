package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_31403 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String A = br.readLine();
    String B = br.readLine();
    String C = br.readLine();

    bw.write(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C) + "\n");
    bw.write(Integer.parseInt(A+B)-Integer.parseInt(C) + "\n");

    bw.flush();
  }
}
