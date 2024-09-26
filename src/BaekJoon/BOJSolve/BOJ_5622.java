package BaekJoon.BOJSolve;

import java.io.*;
import java.lang.*;

public class BOJ_5622 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();
    int sum = 0;

    for (int i = 0; i < st.length(); i++) {
      switch (st.charAt(i)) {
        case 'A': case 'B': case 'C':
          sum += 2+1;
          break;
        case 'D': case 'E': case 'F':
          sum += 3+1;
          break;
        case 'H': case 'I': case 'G':
          sum += 4+1;
          break;
        case 'J': case 'K': case 'L':
          sum += 5+1;
          break;
        case 'M': case 'N': case 'O':
          sum += 6+1;
          break;
        case 'P': case 'Q': case 'R': case 'S':
          sum += 7+1;
          break;
        case 'T': case 'U': case 'V':
          sum += 8+1;
          break;
        case 'W': case 'X': case 'Y': case 'Z':
          sum += 9+1;
          break;
      }
    }
    bw.write(sum + "\n");
    bw.flush();
  }
}
