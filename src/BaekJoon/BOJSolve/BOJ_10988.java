package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_10988 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();
    char[] ch = st.toCharArray();
    int count = 0;
    int result = 0;

    while (true) {
      if (ch[count] == ch[ch.length - count - 1]) {
        result = 1;
        count++;
        if (count >= ch.length-count-1) {
          break;
        }
      } else if (ch[count] != ch[ch.length - count - 1]) {
        result = 0;
        break;
      }
    }
    bw.write(result + "\n");
    bw.flush();
  }
}
