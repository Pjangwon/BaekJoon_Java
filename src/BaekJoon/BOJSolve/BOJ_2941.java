package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2941 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();
    int count = st.length();

    for (int i = 1; i < st.length(); i++) {
      if (st.charAt(i) == '=') {
        if (st.charAt(i - 1) == 'z') {
          if (st.charAt(i - 2) == 'd') {
            count -= 2;
          } else {
            count--;
          }
        }
        else if (st.charAt(i - 1) == 'c') {
          count--;
        }
        else if (st.charAt(i - 1) == 's') {
          count--;
        }


      }
      else if (st.charAt(i) == '-') {
        count--;
      }
      else if (st.charAt(i) == 'j') {
        if (st.charAt(i - 1) == 'l' || st.charAt(i - 1) == 'n') {
          count--;
        }
      }
    }
    bw.write(count + "\n");
    bw.flush();
  }
}