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

    long isPosition = 0;
    long count = 1;

    while (true) {
      isPosition += A;

      if (isPosition >= V) {
        bw.write(count + "\n");
        break;
      }

      count++;
      isPosition -= B;
    }

    bw.flush();
  }
}