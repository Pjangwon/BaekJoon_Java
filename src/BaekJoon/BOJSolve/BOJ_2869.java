package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2869 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();

    long A = Long.parseLong(st.split(" ")[0]);
    long B = Long.parseLong(st.split(" ")[1]);
    long V = Long.parseLong(st.split(" ")[2]);

    long result = ((V - B) % (A - B) == 0) ? (V - B) / (A - B) : (V - B) / (A - B) + 1;

    bw.write(result + "\n");
    bw.flush();
  }
}