package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2941 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();

    String[] alpabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    for (int i = 0; i < alpabet.length; i++) {
      if (st.contains(alpabet[i])) {
        st = st.replace(alpabet[i], "@");
      }
    }

    bw.write(st.length() + "\n");
    bw.flush();
  }
}